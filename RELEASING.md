# Releasing

1. Update the `VERSION_NAME` in `gradle.properties` to the AOSP tag version.

2. Update the `CHANGELOG.md`.

3. Update the `README.md` so the "Download" section reflects the new release version.

4. Commit

   ```
   $ git commit -am "Prepare version X.Y.X"
   ```

5. Publish

    ```
    $ ./gradlew clean publish
    ```

6. Tag

   ```
   $ git tag -am "Version X.Y.Z" X.Y.Z
   ```

7. Update the `VERSION_NAME` in `gradle.properties` to "HEAD-SNAPSHOT" version.

8. Commit

   ```
   $ git commit -am "Prepare next development version"
   ```

9. Push!

   ```
   $ git push && git push --tags
   ```
