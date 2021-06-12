package com.stathis.elmepaunivapp.ui.syllabus.repos

import com.stathis.elmepaunivapp.ui.syllabus_lessons.model.LessonKt

class DataLessonsRepo {

    fun getSemesterA(): List<LessonKt> {
        return listOf(
            LessonKt("Εισαγωγή στην Οικονομική Θεωρία", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Οργάνωση και Διοίκηση Επιχειρήσεων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Μαθηματική Ανάλυση", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Επιχειρησιακή Επικοινωνία", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \nΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"),
            LessonKt("Εισαγωγή στην πληροφορική", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"))
    }

    fun getSemesterB() : List<LessonKt> {
        return listOf(
            LessonKt("Πιθανότητες και Στατιστική", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Μάρκετινγκ", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Αρχές Λογιστικής", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Δομημένος Προγραμματισμός", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \nΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"),
            LessonKt("Γραμμική Άλγεβρα και Διακριτά Μαθηματικά", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"))
    }

    fun getSemesterC() : List<LessonKt> {
        return listOf(
            LessonKt("Επιχειρησιακή Έρευνα", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Εφαρμοσμένη Στατιστική", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Αντικειμενοστραφής Προγραμματισμός", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \nΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"),
            LessonKt("Αλγόριθμοι και Δομές Δεδομένων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Χρηματοοικονομική Λογιστική", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"))
    }

    fun getSemesterD() : List<LessonKt> {
        return listOf(
            LessonKt("Χρηματοοικονομική Διοίκηση", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Λήψη Επιχειρηματικών Αποφάσεων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Βάσεις Δεδομένων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \nΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"),
            LessonKt("Μέθοδοι Βελτιστοποίησης", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Σχεδιασμός και Βέλτιστη Εμπειρία Χρήση (UX)", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"))
    }

    fun getSemesterE() : List<LessonKt> {
        return listOf(
            LessonKt("Διοίκηση Έργων και Προγραμμάτων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Διοίκηση Ποιότητας", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Μηχανική Μάθηση", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Επιχειρησιακή Διαδικτύωση και Ηλεκτρονικές Συναλλαγές", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Πληροφοριακά Συστήματα", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"))
    }

    fun getSemesterF() : List<LessonKt> {
        return listOf(
            LessonKt("Διαχείριση Ανθρωπίνων Πόρων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Τεχνολογία Λογισμικού", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Διαχείριση και επεξεργασία Μεγάλου όγκου δεδομένων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Ηλεκτρονικό Εμπόριο και Εφαρμογές Διαδικτύου", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Συστήματα Διαχείρισης Επιχειρησιακών Πόρων", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Οργάνωση Υπολογιστών και Λειτουργικά Συστήματα", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Σχεδίαση και Ανάπτυξη Κινητών Εφαρμογών", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \nΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"),
            LessonKt("Παραγωγή Ψηφιακού Περιεχομένου", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \nΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"))
    }

    fun getSemesterG() : List<LessonKt> {
        return listOf(
            LessonKt("Ανάπτυξη Προσωπικών Ικανοτήτων", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Επιχειρηματική Αναλυτική", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Στοχαστική Μοντελοποίηση και Προσομοίωση", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Ψηφιακή Καινοτομία και Επιχειρηματικότητα", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Ανάλυση Χρονοσειρών", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Προχωρημένα Θέματα Βάσεων Δεδομένων", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Διοίκηση Εφοδιαστικής Αλυσίδας", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Ανάπτυξη Διαδικτυακών και Νεφοϋπολογιστικών Εφαρμογών", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \n ΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"))
    }

    fun getSemesterH() : List<LessonKt> {
        return listOf(
            LessonKt("Πτυχιακή Εργασία", "Μάθημα Υποχρεωτικό", " ","data"),
            LessonKt("Επιχειρηματικός Σχεδιασμός", "Μάθημα Υποχρεωτικό", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Πρακτική Άσκηση", "Μάθημα Επιλογής", " ","data"),
            LessonKt("Προχωρημένα Συστήματα Διαχείρισης Επιχειρησιακών Πόρων", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 2 ΩΡΕΣ \nΕΡΓΑΣΤΗΡΙΟ : 2 ΩΡΕΣ","data"),
            LessonKt("Ανάλυση Πολυμεσικών Δεδομένων", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Θέματα Επιχειρησιακής Έρευνας και Συστημάτων Αποφάσεων", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Οπτική και Διερευνητική Ανάλυση Δεδομένων", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Επιχειρηματική Ευφυΐα & Διαχείριση Γνώσης", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"),
            LessonKt("Προχωρημένα Θέματα Υπολογιστικής Νοημοσύνης", "Μάθημα Επιλογής", "ΘΕΩΡΙΑ : 4 ΩΡΕΣ","data"))
    }
}