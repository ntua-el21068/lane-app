# [Working Title: "Lane"] — AI-Driven Companion for Mindful Self-Organization

> *"Δεν είμαστε στατικά όντα. Είμαστε δυναμικές οντότητες, που διαβαίνουν από τη μια στιγμή στην άλλη."*

---

## 1. Vision Statement

Ένα app που δεν προσπαθεί να γίνει ο ψυχολόγος σου, αλλά ο **σύντροφος οργάνωσης και αυτογνωσίας** σου: ένα εργαλείο που σε βοηθά να βλέπεις τη ζωή σου σε **μονοπάτια** (lanes) και **κεφάλαια** (seasons), και σου δίνει presence, δομή και ειλικρίνεια — όχι γενικές, "ό,τι θες ν' ακούσεις" απαντήσεις.

Δεν λέει στον χρήστη ποιος είναι ή τι πρέπει να κάνει. **Δείχνει** στον χρήστη αυτό που ο ίδιος του αποκάλυψε, και του προτείνει ένα μονοπάτι. Κανένα μονοπάτι δεν είναι "σωστό" ή "λάθος" — είναι απλά μονοπάτια, και ο guide είναι εκεί για να σε βοηθήσει να επιλέξεις, να χτίσεις ή να βρεις ένα.

**Προσωπικό κίνητρο:** Project που γεννιέται από προσωπικό passion για mindfulness/well-being tooling, μετά από μια περίοδο burnout, παράλληλα με αναζήτηση πρώτης δουλειάς ως developer. Στόχος: ένα ολοκληρωμένο, σταδιακά υλοποιούμενο (divide & conquer) project που να αποδεικνύει στάδιο σχεδιασμού, αρχιτεκτονικής σκέψης και πρακτικής υλοποίησης (Git workflow, frameworks, collaboration-ready tasks).

---

## 2. Core Philosophy

| Αρχή | Τι σημαίνει στην πράξη |
|---|---|
| **AI όχι ως θεραπευτή, αλλά ως καθρέφτη** | Ο Guide δεν διαγιγνώσκει, δεν υποδεικνύει ταυτότητα. Αντανακλά αυτό που του δείχνει ο χρήστης και προτείνει κατεύθυνση. |
| **Όχι "sycophantic" AI** | Καμία λογική "θα σου πω ό,τι θες ν' ακούσεις". Ο Guide μπορεί να πει "αυτό δεν θα το έκανα" χωρίς να γίνεται judgmental ή ρομποτικός. |
| **Δυναμικότητα, όχι στατικότητα** | Ο άνθρωπος είναι ρευστός. Η εφαρμογή πρέπει να αντανακλά αυτή τη ρευστότητα — στον χαρακτήρα του Guide, στο πλαίσιο (Season), στο "τώρα" (Now Point). |
| **Μόνιμο σε ουσία, μεταβλητό σε μορφή** | Ο Guide μπορεί να αλλάζει "ενσάρκωση" (μορφή/χαρακτήρα) αλλά παραμένει μια αληθινή, σταθερή παρουσία πίσω από τις μορφές. |
| **Affirmations, όχι performance ενδιαφέροντος** | Generic-ενούσιες, στιβαρές προτάσεις/affirmations που "χτυπούν" στη σωστή στιγμή — όχι ψεύτικη προσωποποίηση τύπου "hey, how did the exam go?". |
| **Body – Mind – Body-Mind** | Κάθε guidance/activity/insight κατηγοριοποιείται ως σωματικό, ψυχικό, ή σωματοψυχικό. |

---

## 3. Core Domain Entities

Αυτή είναι η εννοιολογική βάση δεδομένων του προϊόντος — μιλάμε ουσιαστικά για ένα **conceptual data model**, πριν καν μπει τεχνική υλοποίηση.

### 3.1 `User`
- Προφίλ που χτίζεται προοδευτικά μέσα από τη συνομιλία (δεν ξέρει τίποτα στην αρχή — cold start).
- Δεν είναι ένα στατικό set προτιμήσεων, αλλά ένα **εξελισσόμενο context** που τροφοδοτεί τα φίλτρα της AI.

### 3.2 `Guide`
- Η AI-οντότητα-personality, ο "εσύ" της εμπειρίας.
- **Μορφή**: μπορεί να ενσαρκώνεται ποικιλοτρόπως (π.χ. ένας μέντορας "Markus", μια νύμφη των υδάτων, ένα άγριο ζώο, μια πλευρά του εαυτού του χρήστη). Η μορφή είναι customizable / rotating.
- **Μηχανισμοί εναλλαγής μορφής** (προς απόφαση):
  - Server-driven rotation (π.χ. ανά ώρα/μέρα).
  - Rotation βάσει τύπου Season/Lane (διαφορετική μορφή για διαφορετικό είδος καθοδήγησης).
  - User-driven customization.
- **Συμπεριφορά**: σταθερή προσωπικότητα-πυρήνα (personality kernel) ανεξαρτήτως μορφής· αυτό που ο χρήστης λαμβάνει είναι πάντα "αληθινό" και συνεκτικό.

### 3.3 `Season`
- Χρονικό "κεφάλαιο" ζωής, με ελεύθερο, dynamically-fabricated μέγεθος (1 μέρα → εξεταστική 15 ημερών → Erasmus 3 μήνες).
- Δημιουργείται οργανικά μέσα από τη συζήτηση (ο χρήστης + ο Guide "καταλήγουν" ότι κάτι αξίζει να γίνει Season).
- Λειτουργεί ως **φίλτρο context**: διαμορφώνει τι affirmations, insights, activities και προσωπικότητα προτείνει ο Guide όσο διαρκεί.
- Μπορεί να "κλείσει/αρχειοθετηθεί" σαν journal entry — η αίσθηση του "chapter" στη ζωή.

### 3.4 `Now Point` (Dynamic)
- Το ζωντανό, τρέχον context-state του χρήστη — ανανεώνεται με κάθε "εξομολόγηση"/είσοδο.
- Παράγει **short-term organization** (π.χ. "τις επόμενες 3 μέρες χρειάζεσαι Χ").
- Είναι ο μηχανισμός που μεταφράζει υπαρξιακά ερωτήματα ("πού είμαι, πού πάω, πώς μπορώ να συμπεριφερθώ/αισθανθώ") σε συγκεκριμένη, βιώσιμη δομή.

### 3.5 `Board` (Whiteboard / Canvas)
- Οπτικός χώρος με auto-generated, customizable αντικείμενα: planners, reminders, notes, checklists.
- Παράγονται αυτόματα από τη συζήτηση (AI εξάγει δομή από free-form dialogue → αντικείμενο στο board).
- Concept: *"We have to empty ourselves to make space for the new — let the board be the canvas."*

### 3.6 `Activity`
- Κατηγοριοποιημένες, χρονικές ασκήσεις (π.χ. 15' yoga flow, 5' breathing exercise).
- Κατηγορίες: Body / Mind / Body-Mind.
- Φιλτράρισμα κατά **διάρκεια** εξίσου σημαντικό με τον τύπο (insight: οι χρήστες ψάχνουν βάσει χρόνου που έχουν, όχι μόνο βάσει τύπου).
- Πιθανή ενσωμάτωση: extension/integration με προηγούμενο project, **Memory Lanes**, ως πρόσθετη δραστηριότητα.

### 3.7 `Notification / Check-in System`
- Προτρέπει σε ενδοσκόπηση ("check in with yourself").
- Παραδίδει affirmations/reminders βάσει του ενεργού Season + Now Point.
- Στυλιστικός κανόνας: generic-ενούσια, όχι ψευδο-προσωπικά ("πώς πήγε η εξέταση;").

---

## 4. UX / Interaction Flow

### 4.1 Onboarding (cold start)
Ο Guide δεν ξέρει τίποτα. Πρώτη αλληλεπίδραση τύπου:
> *"Βοήθησέ με να οργανωθώ. Πώς θα συντονίσω τόσα πράγματα που συμβαίνουν; Έχω στόχο στο κοντινό μέλλον, χωρίς ανάγκη μόνιμης προσήλωσης — θέλω να βρω το κέντρο μου."*

### 4.2 The Guide Room
Κεντρικός χώρος συζήτησης (old-school chat structure + strong personality), όπου ζει η τρέχουσα μορφή του Guide.

### 4.3 Dialogue → Structure
1. Ο χρήστης μοιράζεται κατάσταση/συναίσθημα/πίεση.
2. Ο Guide αποσαφηνίζει το user state (mental / physical / body-mind) μέσα από διάλογο, όχι ερωτηματολόγιο.
3. Από τη συζήτηση μπορεί να προκύψει:
   - Μια νέα **Season** (αρχειοθέτηση κεφαλαίου).
   - Ένα **Now Point** update (short-term organization).
   - Ένα **Board object** (π.χ. daily planner).
   - Μια προτεινόμενη **Activity**.
   - Ένα **affirmation/insight**.

### 4.4 Sample Scenario (ως reference flow)
> Ο χρήστης αισθάνεται πίεση/overwhelm από καθημερινές υποχρεώσεις.
> Ο Guide ανοίγει διάλογο για να αποσαφηνίσει mental/physical state.
> Η συζήτηση καταλήγει σε δημιουργία Season ("ένα κεφάλαιο που θέλουμε να φακελώσουμε").
> Notification αργότερα προτρέπει σε check-in, με affirmation βάσει του Season.
> Ο Guide προτείνει activity (π.χ. 15' yoga ή 5' breathing exercise) ανάλογα με διαθέσιμο χρόνο.

---

## 5. Differentiation — "Γιατί όχι απλά ένα chat στο Claude/Gemini/ChatGPT;"

- **Strong personality kernel** σε όλη την εμπειρία — όχι generic assistant tone.
- **Δεδικός χώρος** (room) φτιαγμένος γύρω από τη ζωή και τις ανάγκες του χρήστη, όχι ένα stateless παράθυρο chat.
- **Persistent δομικές οντότητες** (Season, Now Point, Board) που δίνουν συνέχεια και αφήγηση στον χρόνο — όχι μεμονωμένες απαντήσεις.
- **Activities/games-as-extension** (π.χ. Memory Lanes integration) — η εμπειρία είναι playful, όχι μόνο conversational.
- **Σκόπιμη απουσία sycophancy**: ο Guide δεν "πάει με τα νερά" του χρήστη.

---

## 6. Phased Roadmap (Divide & Conquer)

> Στόχος: κάθε φάση να παράγει κάτι demo-able, και να σπάει σε tasks των 10–30 λεπτών για collaborators.

### Phase 0 — Foundations
- Οριστικοποίηση naming (working title, terminology γλωσσάρι: Guide, Season, Lane, Now Point, Board).
- Τεχνική στοίβα (decision: web app; πιθανό stack — front-end framework + backend API + DB + LLM API integration).
- Repo setup, CI/CD skeleton, README, contribution guide.

### Phase 1 — MVP: The Guide Room (text-only)
- Βασικό chat interface με μία default μορφή Guide.
- Σύνδεση με LLM API (system prompt που ενσαρκώνει τις αρχές της Ενότητας 2).
- Persistence: αποθήκευση συνομιλίας/βασικού user profile.

### Phase 2 — Now Point & Season Engine
- Λογική εξαγωγής "Season" από συζήτηση (AI-assisted tagging/summarization).
- Dynamic Now Point: ενημέρωση context state από νέα inputs.
- Βασικό "αρχειοθετημένα Seasons" view (σαν journal).

### Phase 3 — Board / Canvas
- UI για whiteboard.
- Auto-generation αντικειμένων (planner, reminders) από τη συζήτηση.
- CRUD πάνω σε board objects.

### Phase 4 — Guide Personas
- Σύστημα πολλαπλών μορφών Guide (data model + selection logic: server-driven / season-driven / user-driven).
- Personality kernel διαχωρισμένο από "skin" (μορφή).

### Phase 5 — Activities Library
- Κατάλογος δραστηριοτήτων με tags: τύπος (Body/Mind/Body-Mind) × διάρκεια.
- Recommendation logic βάσει Now Point + διαθέσιμου χρόνου.

### Phase 6 — Notifications & Affirmations
- Notification engine συνδεδεμένο με Season/Now Point.
- Affirmation generation/curation (generic αλλά στοχευμένο).

### Phase 7 — Extensions
- Integration hooks για επιπλέον δραστηριότητες/games (π.χ. Memory Lanes).

---

## 7. Initial Task Backlog (10–30 λεπτά εργασίας — git-issue ready)

> Παράδειγμα αρχικού breakdown, ώστε φίλοι/συνεργάτες να μπορούν να πάρουν task χωρίς context overhead.

- [ ] Setup repo structure (`/frontend`, `/backend`, `/docs`) + linting config.
- [ ] Γράψιμο glossary.md με τους όρους Guide/Season/Now Point/Lane/Board.
- [ ] Σχεδίαση wireframe (low-fi) για το Guide Room.
- [ ] Βασικό schema: `User`, `Season`, `Message` (μόνο πεδία, χωρίς migration ακόμα).
- [ ] System prompt draft v1 για τον Guide (persona-agnostic, βάσει Ενότητας 2).
- [ ] Endpoint skeleton: `POST /message` (no LLM call yet, mock response).
- [ ] Frontend: static chat bubble UI component.
- [ ] Διερεύνηση LLM provider options (κόστος/latency/streaming support).
- [ ] Λίστα 10 πρώτων activities (τίτλος, τύπος, διάρκεια) σε JSON/CSV.
- [ ] Draft affirmation bank v1 (20 generic, μη-creepy affirmations).

---

## 8. Open Questions (προς απόφαση πριν Phase 1 ολοκληρωθεί)

1. Πόσο "βαθιά" memory/context κρατάμε ανά χρήστη; (privacy & data retention implications)
2. Ο μηχανισμός εναλλαγής μορφής Guide: server-scheduled, season-based, ή user-selectable — ή συνδυασμός;
3. Πώς ορίζουμε formal "Season boundaries" (auto-detected vs. explicit user confirmation)?
4. Ποιο LLM/API ταιριάζει στο budget & στο use case (latency για conversational feel)?
5. Mobile-first ή web-first για MVP;

---

## 9. Naming Convention Note

Working title χρησιμοποιεί προσωρινά "Lane" λόγω της μεταφοράς "μονοπάτι στη ζωή" — ανοιχτό προς οριστικοποίηση (μπορεί να αλλάξει χωρίς να επηρεάσει τη δομή του εγγράφου).
