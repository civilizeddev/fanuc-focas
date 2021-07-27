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
public class odbtlife2 extends Structure {
	/** dummy */
	public short[] dummy = new short[2];
	/** data */
	public NativeLong data;
	public odbtlife2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dummy", "data");
	}
	public odbtlife2(short dummy[], NativeLong data) {
		super();
		if ((dummy.length != this.dummy.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy = dummy;
		this.data = data;
	}
	public odbtlife2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbtlife2 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbtlife2 implements Structure.ByValue {
		
	};
}
