package com.stathis.elmepaunivapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.stathis.elmepaunivapp.models.DeptFieldsOfStudy;
import com.stathis.elmepaunivapp.models.DepMembers;
import com.stathis.elmepaunivapp.models.ProfessorModel;
import com.stathis.elmepaunivapp.models.Programmes;
import com.stathis.elmepaunivapp.models.SocialChannels;
import com.stathis.elmepaunivapp.models.UsefulLinks;
import com.stathis.elmepaunivapp.recyclerview.DepMembersAdapter;
import com.stathis.elmepaunivapp.recyclerview.FieldsAdapter;
import com.stathis.elmepaunivapp.recyclerview.ItemClickListener;
import com.stathis.elmepaunivapp.recyclerview.ProgrammesAdapter;
import com.stathis.elmepaunivapp.recyclerview.SocialChannelAdapter;

import java.util.ArrayList;

import static android.Manifest.permission.CALL_PHONE;

public class Department extends AppCompatActivity  {

    private static final int REQUEST_CALL = 1;
    private FloatingActionButton call, mail;
    private RecyclerView fields_recView, programmes_recView,depMembers_recView, social_recView;
    private FieldsAdapter fieldsAdapter;
    private ProgrammesAdapter programmesAdapter;
    private DepMembersAdapter depMembersAdapter;
    private ArrayList<DeptFieldsOfStudy> fieldsOfStudy;
    private SocialChannelAdapter socialChannelAdapter;
    private ArrayList<Programmes> programmes;
    private ArrayList<DepMembers> depMembers;
    private ArrayList<SocialChannels> socialChannels;
    private CardView virtual_tour;
    private Button researchInDept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        //createLists
        createLists();

        call = findViewById(R.id.fab_call);
        mail = findViewById(R.id.fab_mail);
        virtual_tour = findViewById(R.id.virtual_tour);
        researchInDept = findViewById(R.id.research_card_btn);

        //rec Views & adapters
        fields_recView = findViewById(R.id.fieldsOfStudy_recView);
        fieldsAdapter = new FieldsAdapter(fieldsOfStudy, new ItemClickListener() {
            @Override
            public void onClick(View v) {
            }

            @Override
            public void onItemClick(DeptFieldsOfStudy item) {
                switch (item.getName()) {
                    case "Επιστήμη των Δεδομένων & Τεχνολογίες Πληροφορικής":
                        //
                    case "Διοίκηση Επιχειρήσεων & Οργανισμών":
                        //
                    case "Ψηφιακό Μάρκετινγκ και Επικοινωνία":
                        //
                }
                ;
            }

            @Override
            public void onProgrammesClick(Programmes programmes) {
            }

            @Override
            public void onProfessorClick(ProfessorModel professorModel) {
            }

            @Override
            public void onUsefulLinksClick(UsefulLinks usefulLinks) {
            }

            @Override
            public void onSocialItemClick(SocialChannels socialChannels) {

            }
        });
        //fields adapter
        fields_recView.setAdapter(fieldsAdapter);
        programmes_recView = findViewById(R.id.programmes_recView);
        programmesAdapter = new ProgrammesAdapter(programmes, new ItemClickListener() {

            @Override
            public void onClick(View v) {
            }

            @Override
            public void onItemClick(DeptFieldsOfStudy item) {
            }

            @Override
            public void onProgrammesClick(Programmes programmes) {
                switch (programmes.getName()) {
                    case "Προπτυχιακές Σπουδές":
                        Intent undergraduates = new Intent(Department.this, UndergraduateProg.class);
                        startActivity(undergraduates);
                        break;
                    case "Μεταπτυχιακά Προγράμματα":
                        Intent postgraduates = new Intent(Department.this, PostgraduateProg.class);
                        startActivity(postgraduates);
                        break;
                    case "Εκπόνηση Διδακτορικού":
                        Intent phd = new Intent(Department.this, PhdProg.class);
                        startActivity(phd);
                }
            }

            @Override
            public void onProfessorClick(ProfessorModel professorModel) {
            }

            @Override
            public void onUsefulLinksClick(UsefulLinks usefulLinks) {
            }

            @Override
            public void onSocialItemClick(SocialChannels socialChannels) {
            }
        });
        programmes_recView.setAdapter(programmesAdapter);
        //dep members
        depMembers_recView = findViewById(R.id.depMembers_recView);
        depMembersAdapter = new DepMembersAdapter(depMembers);
        depMembers_recView.setAdapter(depMembersAdapter);

        //social adapter
        social_recView = findViewById(R.id.social_recView);
        socialChannelAdapter = new SocialChannelAdapter(socialChannels, new ItemClickListener() {
            @Override
            public void onItemClick(DeptFieldsOfStudy item) {
            }

            @Override
            public void onProgrammesClick(Programmes programmes) {
            }

            @Override
            public void onProfessorClick(ProfessorModel professorModel) {
            }

            @Override
            public void onUsefulLinksClick(UsefulLinks usefulLinks) {
            }

            @Override
            public void onSocialItemClick(SocialChannels socialChannels) {
                switch (socialChannels.getImg()) {
                    case R.drawable.map:
                        String MapUrl = socialChannels.getUrl();
                        Intent OpenMap = new Intent(Intent.ACTION_VIEW, Uri.parse(MapUrl));
                        startActivity(OpenMap);
                        break;
                    case R.drawable.youtube:
                        String youtubeUrl, LinkedInUrl, ResearchGateUrl;
                        youtubeUrl = socialChannels.getUrl();
                            try {
                                //goes to channel in youtube app
                                String inAppUrl = "vnd.youtube.com/channel/"+ youtubeUrl;
                                Intent Youtube = new Intent(Intent.ACTION_VIEW, Uri.parse(inAppUrl));
                                startActivity(Youtube);
                            } catch (Exception e){
                                //goes to channel in web view (opens browser)
                                String WebUrl = "https://www.youtube.com/channel/"+ youtubeUrl;
                                Intent Youtube = new Intent(Intent.ACTION_VIEW, Uri.parse(WebUrl));
                                startActivity(Youtube);
                            }
                        break;
                    case R.drawable.linkedin:
                        LinkedInUrl = socialChannels.getUrl();
                        Intent Linkedin = new Intent(Intent.ACTION_VIEW, Uri.parse(LinkedInUrl));
                        startActivity(Linkedin);
                        break;
                    case R.drawable.researchgate:
                        ResearchGateUrl = socialChannels.getUrl();
                        Intent rg = new Intent(Intent.ACTION_VIEW, Uri.parse(ResearchGateUrl));
                        startActivity(rg);
                        break;
                }
            }

            @Override
            public void onClick(View v) {
            }
        });
        social_recView.setAdapter(socialChannelAdapter);

        //virtual tour
        virtual_tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String openUrl = "https://mst.hmu.gr/hmutour/";
                Intent VirtualTour = new Intent(Department.this, VirtualTour.class);
                VirtualTour.putExtra("VirtualTourUrl",openUrl);
                startActivity(VirtualTour);
            }
        });

        //Fab Buttons
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAtSecretaryOffice();
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendAnEmailToSecretaryOffice();
            }
        });
        //bottom navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_uni);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent i;
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        i = new Intent(Department.this, Dashboard.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.nav_students:
                        i = new Intent(Department.this, Students.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.nav_uni:
                        return true;
                    case R.id.nav_search:
                        i = new Intent(Department.this, Professors.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        break;
                }
                return false;
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                callAtSecretaryOffice();
            } else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void callAtSecretaryOffice() {
        if (ContextCompat.checkSelfPermission(Department.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Department.this, new String[]{CALL_PHONE}, REQUEST_CALL);
        } else {
            String phone = "tel:2841091103";
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse(phone));
            startActivity(callIntent);
        }
    }

    private void sendAnEmailToSecretaryOffice() {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"kalarhaki@hmu.gr"});
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Department.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    private void createLists() {
        fieldsOfStudy = new ArrayList<>();
        fieldsOfStudy.add(new DeptFieldsOfStudy("Επιστήμη των Δεδομένων & Τεχνολογίες Πληροφορικής", R.drawable.data));
        fieldsOfStudy.add(new DeptFieldsOfStudy("Διοίκηση Επιχειρήσεων & Οργανισμών", R.drawable.business));
        fieldsOfStudy.add(new DeptFieldsOfStudy("Ψηφιακό Μάρκετινγκ και Επικοινωνία", R.drawable.digitalmkt));

        programmes = new ArrayList<>();
        programmes.add(new Programmes("Προπτυχιακές Σπουδές", "ΔΙΑΡΚΕΙΑΣ 4 ΕΤΩΝ", R.drawable.ungrad));
        programmes.add(new Programmes("Μεταπτυχιακά Προγράμματα", "ΔΙΑΡΚΕΙΑΣ 2 ΕΤΩΝ", R.drawable.postgrad));
        programmes.add(new Programmes("Εκπόνηση Διδακτορικού", "ΕΛΑΧΙΣΤΗΣ ΔΙΑΡΚΕΙΑΣ 3 ΕΤΩΝ", R.drawable.phd));

        depMembers = new ArrayList<>();
        depMembers.add(new DepMembers("Στέλιος Παπαδάκης",
                "ΚΑΘΗΓΗΤΗΣ | ΚΟΣΜΗΤΟΡΑΣ ΣΕΔΟ",
                "Ο Δρ. Στέλιος Παπαδάκης είναι κοσμήτορας της Σχολής Επιστημών Διοίκησης και Οικονομίας και Καθηγητής στο τμήμα Διοικητικής Επιστήμης και Τεχνολογίας.",
                "https://www.linkedin.com/in/costas-panagiotakis-729b354",
                "https://www.researchgate.net/profile/Costas_Panagiotakis",
                "https://scholar.google.com/citations?user=ORyzzCQAAAAJ","COMPUTATIONAL INTELLIGENCE","PARALLEL & DISTRIBUTED ALGORITHMS","FUZZY SYSTEMS",
                R.drawable.papadakis));
        depMembers.add(new DepMembers("Κώστας Παναγιωτάκης",
                "ΑΝΑΠΛΗΡΩΤΗΣ ΚΑΘΗΓΗΤΗΣ | ΠΡΟΕΔΡΟΣ ΤΜΗΜΑΤΟΣ",
                "Είναι πτυχιούχος του Τμήματος Επιστήμης Υπολογιστών του Πανεπιστημίου Κρήτης (2001), με Μεταπτυχιακό (2003) και Διδακτορικό Δίπλωμα (2007) από το ίδιο Τμήμα. Εργάστηκε ως Επισκέπτης Καθηγητής στο Πανεπιστήμιο Κρήτης. Το 2010 διορίστηκε Επίκουρος Καθηγητής και από το 2014 είναι Αναπληρωτής Καθηγητής.",
                "https://www.linkedin.com/in/stelios-papadakis-749110a/",
                "https://www.researchgate.net/profile/Stelios_Papadakis",
                "https://scholar.google.com/citations?user=tTj1pbcAAAAJ","SIGNAL, IMAGE PROCESSING","PATTERN RECOGNITION","MULTIMEDIA",
                R.drawable.panagiotakis));
        depMembers.add(new DepMembers("Στέλιος Παπαδάκης",
                "ΚΑΘΗΓΗΤΗΣ | ΚΟΣΜΗΤΟΡΑΣ ΣΕΔΟ",
                "Ο Δρ. Στέλιος Παπαδάκης είναι κοσμήτορας της Σχολής Επιστημών Διοίκησης και Οικονομίας και Καθηγητής στο τμήμα Διοικητικής Επιστήμης και Τεχνολογίας.",
                "https://www.linkedin.com/in/stelios-papadakis-749110a/",
                "https://www.researchgate.net/profile/Stelios_Papadakis",
                "https://scholar.google.com/citations?user=tTj1pbcAAAAJ","COMPUTATIONAL INTELLIGENCE","PARALLEL & DISTRIBUTED ALGORITHMS","FUZZY SYSTEMS",
                R.drawable.mastorakis));
        depMembers.add(new DepMembers("Στέλιος Παπαδάκης",
                "ΚΑΘΗΓΗΤΗΣ | ΚΟΣΜΗΤΟΡΑΣ ΣΕΔΟ",
                "Ο Δρ. Στέλιος Παπαδάκης είναι κοσμήτορας της Σχολής Επιστημών Διοίκησης και Οικονομίας και Καθηγητής στο τμήμα Διοικητικής Επιστήμης και Τεχνολογίας.",
                "https://www.linkedin.com/in/stelios-papadakis-749110a/",
                "https://www.researchgate.net/profile/Stelios_Papadakis",
                "https://scholar.google.com/citations?user=tTj1pbcAAAAJ","COMPUTATIONAL INTELLIGENCE","PARALLEL & DISTRIBUTED ALGORITHMS","FUZZY SYSTEMS",
                R.drawable.kopanakis));
        depMembers.add(new DepMembers("Στέλιος Παπαδάκης",
                "ΚΑΘΗΓΗΤΗΣ | ΚΟΣΜΗΤΟΡΑΣ ΣΕΔΟ",
                "Ο Δρ. Στέλιος Παπαδάκης είναι κοσμήτορας της Σχολής Επιστημών Διοίκησης και Οικονομίας και Καθηγητής στο τμήμα Διοικητικής Επιστήμης και Τεχνολογίας.",
                "https://www.linkedin.com/in/stelios-papadakis-749110a/",
                "https://www.researchgate.net/profile/Stelios_Papadakis",
                "https://scholar.google.com/citations?user=tTj1pbcAAAAJ","COMPUTATIONAL INTELLIGENCE","PARALLEL & DISTRIBUTED ALGORITHMS","FUZZY SYSTEMS",
                R.drawable.dimotikalis));
        depMembers.add(new DepMembers("Στέλιος Παπαδάκης",
                "ΚΑΘΗΓΗΤΗΣ | ΚΟΣΜΗΤΟΡΑΣ ΣΕΔΟ",
                "Ο Δρ. Στέλιος Παπαδάκης είναι κοσμήτορας της Σχολής Επιστημών Διοίκησης και Οικονομίας και Καθηγητής στο τμήμα Διοικητικής Επιστήμης και Τεχνολογίας.",
                "https://www.linkedin.com/in/stelios-papadakis-749110a/",
                "https://www.researchgate.net/profile/Stelios_Papadakis",
                "https://scholar.google.com/citations?user=tTj1pbcAAAAJ","COMPUTATIONAL INTELLIGENCE","PARALLEL & DISTRIBUTED ALGORITHMS","FUZZY SYSTEMS",
                R.drawable.lemonakis));
        depMembers.add(new DepMembers("Μάνος Περακάκης",
                "ΛΕΚΤΟΡΑΣ",
                "Απόφοιτος του τμήματος επιστήμης υπολογιστών του Πανεπιστημίου του Essex, με MSc από το Πανεπιστήμιο του Bristol. Εκπόνησε το διδακτορικό του στο Πανεπιστήμιο του Brunel.",
                "https://www.linkedin.com/in/manosperakakis",
                "https://www.researchgate.net/profile/Emmanuel_Perakakis",
                "https://scholar.google.gr/citations?user=DY82628AAAAJ","UX DESIGN","DIGITAL MARKETING","SOCIAL INTELLIGENCE",
                R.drawable.perakakis));

        socialChannels = new ArrayList<>();
        socialChannels.add(new SocialChannels("Χάρτης", "https://www.google.gr/maps/place/Hellenic+Mediterσ46953,25.6549865,17z/data=!3m1!4b1!4m5!3m4!1s0x149a7fea00679c2f:0x8038b06fd113f3fb!8m2!3d35.1946909!4d25.6571752", R.drawable.map));
        socialChannels.add(new SocialChannels("Youtube", "UCapUQKQVrP2p4_ijj_OxvNg", R.drawable.youtube));
        socialChannels.add(new SocialChannels("LinkedIn", "https://www.linkedin.com/groups/13536369/", R.drawable.linkedin));
        socialChannels.add(new SocialChannels("Research\nGate", "https://www.researchgate.net/institution/Hellenic_Mediterranean_University/department/Department_of_Management_Science_and_Technology_Agios_Nikolaos", R.drawable.researchgate));
    }
}
