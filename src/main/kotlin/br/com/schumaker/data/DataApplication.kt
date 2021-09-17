 package br.com.schumaker.data

import br.com.schumaker.data.model.Console
import br.com.schumaker.data.model.ConsoleRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


 @SpringBootApplication
 class DataApplication {

	 @Bean
	 fun run(repository: ConsoleRepository) = CommandLineRunner {

		 repository.save(
			 Console(
				 name = "Nes",
				 brand = "Nintendo",
				 year = 1985,
				 cpu = "Ricoh 2A03 at 1.79 MHz",
				 gpu = "",
				 ram = "2 KB",
				 vram = "2 KB"
			 )
		 )

		 repository.save(
			 Console(
				 name = "Snes",
				 brand = "Nintendo",
				 year = 1991,
				 cpu = "65C816 at 3.58 MHz",
				 gpu = "",
				 ram = "128 KB",
				 vram = "64 KB"
			 )
		 )

		 repository.save(
			 Console(
				 name = "N64",
				 brand = "Nintendo",
				 year = 1996,
				 cpu = "NEC 4300i at 93.75 MHz",
				 gpu = "Custom Reality Coprocessor at 62.5 MHz",
				 ram = "4.5 MB",
				 vram = ""
			 )
		 )

		 repository.save(
			 Console(
				 name = "Sega Master System",
				 brand = "Sega",
				 year = 1986,
				 cpu = "NEC 780c at 3.58 MHz",
				 gpu = "",
				 ram = "8 KB",
				 vram = "16 KB"
			 )
		 )

		 repository.save(
			 Console(
				 name = "Sega Mega Drive",
				 brand = "Sega",
				 year = 1988,
				 cpu = "Motorola 68000 at 7.6 MHz",
				 gpu = "",
				 ram = "64 KB",
				 vram = "64 KB"
			 )
		 )

		 repository.save(
			 Console(
				 name = "Sega Saturn",
				 brand = "Sega",
				 year = 1994,
				 cpu = "2 Hitachi SH-2 at 28.6 MHz",
				 gpu = "",
				 ram = "2 MB",
				 vram = "1.5 MB"
			 )
		 )
	 }
 }

	 fun main(args: Array<String>) {
		 runApplication<DataApplication>(*args)
	 }
