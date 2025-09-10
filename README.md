## Generate mkdocs versioned documentation

This small project demos creating versioned documentation with mkdocs and mike, taking the version from a Maven POM.

The moving parts:

- small Java/Maven "Hello, World" project
- project documentation in `docs/`
- `mkdocs.yml` with setup for `material` theme and `mike` version provider (and search)
- Github workflow `pages-development.yml` which triggers on pushes to `main`,
  which takes the version for `mike push` from Maven.

### working on the project

1. Clone the repo 
2. Set up a Python venv for local website testing:
   ```shell
   python3 -m venv venv
   . ./venv/bin/activate    # for bash
   python3 -m pip install -r requirements.txt
   ```
3. to see the site: `mike serve` - note that you might not see all versions until you refresh your local `gh-pages` branch.
   <br>_Note:_ be careful making local changes to this branch, it may confuse the `mike` command!
