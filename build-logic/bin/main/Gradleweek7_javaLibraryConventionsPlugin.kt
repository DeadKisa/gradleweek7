/**
 * Precompiled [gradleweek7.java-library-conventions.gradle.kts][Gradleweek7_java_library_conventions_gradle] script plugin.
 *
 * @see Gradleweek7_java_library_conventions_gradle
 */
public
class Gradleweek7_javaLibraryConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Gradleweek7_java_library_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
