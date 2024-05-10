package DisplayProject;

import com.pi4j.Pi4J;
import com.pi4j.boardinfo.util.BoardInfoHelper;
import com.pi4j.io.gpio.digital.DigitalInput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.io.gpio.digital.PullResistance;
import com.pi4j.util.Console;

public class Main {

	public static void main(String[] args) {
		final var console = new Console();
		
		console.title("Musicalia", "DisplayProject");
		
		var pi4j = Pi4J.newAutoContext();
        
        console.println("Board model: " + pi4j.boardInfo().getBoardModel().getLabel());
        console.println("Operating system: " + pi4j.boardInfo().getOperatingSystem());
        console.println("Java versions: " + pi4j.boardInfo().getJavaInfo());
        // This info is also available directly from the BoardInfoHelper, 
        // and with some additional realtime data.
        console.println("Board model: " + BoardInfoHelper.current().getBoardModel().getLabel());
        console.println("Raspberry Pi model with RP1 chip (Raspberry Pi 5): " + BoardInfoHelper.usesRP1());
        console.println("OS is 64-bit: " + BoardInfoHelper.is64bit());
        console.println("JVM memory used (MB): " + BoardInfoHelper.getJvmMemory().getUsedInMb());
        console.println("Board temperature (°C): " + BoardInfoHelper.getBoardReading().getTemperatureInCelsius());


	}

}
