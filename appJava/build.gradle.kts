import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("application")
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

application {
	mainClass = "plby.Main"
}

tasks {
	named<JavaExec>("run") {
		standardInput = System.`in`
	}
	jar {
		manifest {
			attributes(
				mapOf(
					"Main-Class" to "plby.Main"
				)
			)
		}
	}
	withType<JavaCompile>().configureEach {
		options.encoding = "UTF-8"
	}
}
