## Generate mkdocs versioned documentation

This small project demos creating versioned documentation with mkdocs and mike, taking the version from a Maven POM.

The moving parts:

- small Java/Maven "Hello, World" project
- project documentation in `docs/`
- `mkdocs.yml` with setup for `material` theme and `mike` version provider (and search)
- Github workflow `pages-development.yml` which triggers on pushes to `main`,
  which takes the version for `mike push` from Maven.