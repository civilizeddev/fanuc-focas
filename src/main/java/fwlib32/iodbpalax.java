package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class iodbpalax extends Structure {
	public NativeLong max_pal;
	public NativeLong[] data = new NativeLong[32];
	public iodbpalax() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("max_pal", "data");
	}
	public iodbpalax(NativeLong max_pal, NativeLong data[]) {
		super();
		this.max_pal = max_pal;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public iodbpalax(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbpalax implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbpalax implements Structure.ByValue {
		
	};
}
