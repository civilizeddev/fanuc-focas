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
public class odbexeprg extends Structure {
	/** running program name */
	public byte[] name = new byte[36];
	/** running program number */
	public NativeLong o_num;
	public odbexeprg() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("name", "o_num");
	}
	public odbexeprg(byte name[], NativeLong o_num) {
		super();
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		this.o_num = o_num;
	}
	public odbexeprg(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbexeprg implements Structure.ByReference {
		
	};
	public static class ByValue extends odbexeprg implements Structure.ByValue {
		
	};
}
