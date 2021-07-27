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
public class odbalm extends Structure {
	/** dummy */
	public short[] dummy = new short[2];
	/** alarm status */
	public short data;
	public odbalm() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("dummy", "data");
	}
	public odbalm(short dummy[], short data) {
		super();
		if ((dummy.length != this.dummy.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy = dummy;
		this.data = data;
	}
	public odbalm(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbalm implements Structure.ByReference {
		
	};
	public static class ByValue extends odbalm implements Structure.ByValue {
		
	};
}
