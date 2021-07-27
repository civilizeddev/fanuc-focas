package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class prgdir extends Structure {
	/** directory data */
	public byte[] prg_data = new byte[256];
	public prgdir() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("prg_data");
	}
	public prgdir(byte prg_data[]) {
		super();
		if ((prg_data.length != this.prg_data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.prg_data = prg_data;
	}
	public prgdir(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends prgdir implements Structure.ByReference {
		
	};
	public static class ByValue extends prgdir implements Structure.ByValue {
		
	};
}
