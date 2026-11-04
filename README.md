# OOP & Java Practice

Java coursework, exercises and small applications from an OOP course — Maven projects plus
a collection of lab solutions. Vietnamese labels kept as written.

> **On the folder names:** `2351050070_QuachTrongKha_De04` is a student-ID submission
> folder. `Nhut_Ans`, `toanlam`, `DeBai` and `ou` hold exercise material, some of it
> reference answers rather than my own code. I have not sorted out which is which, so the
> repository is left as-is.

## Maven projects

| Folder | What it is |
|---|---|
| `game/` | a small Swing game — `Player`, `Physics`, `Map`, `Camera`, `KeyHandler`, `Terminater` (sic) |
| `Design-Pattern/JavaFXQuizApp-DH23IT01/` | JavaFX quiz app built to practise design patterns |
| `practice/` | exercises from prompts, requirements kept in `DeBai/` |
| `demo/`, `ou/`, `toanlam/`, `2351050070_QuachTrongKha_De04/` | coursework and lab submissions |

Lab exercise requirements are in `DeBai/` (PDFs from OU, TDTU and self-written prompts);
solutions for the TDTU labs are in `Nhut_Ans/`.

## Build

Each project has its own `pom.xml`:

```bash
cd game
mvn package
```

`buildMvn.bash` at the root does **not** build anything — it runs `mvn archetype:generate`
to *scaffold a new* Maven project (`buildMvn <groupId> <artifactId> <package>`). The name
is misleading.

## Stack

Java · Maven · JavaFX · Swing (AWT/Swing rendering plus a hand-rolled physics loop)

## Notes

- **Six `target/` build artifacts are committed**: `2351050070_QuachTrongKha_De04/target/maven-status/…`,
  `demo/target/classes/com/learn/text.txt`, and four `ou/target/classes/com/practice/midtern/…/README.md`.
  The `.gitignore` excludes only one project's `target/`, so the rest slipped in. Generalise the
  rule to `target/` and remove them from the index.
- `.java` counts per folder (approximate, includes reference material):
  `ou/` ~131, `Nhut_Ans/` ~86, `Design-Pattern/` ~24.

## License

No LICENSE file.
