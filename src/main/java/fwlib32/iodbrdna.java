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
public class iodbrdna extends Structure {
	/** dummy */
	public short datano;
	/** data select flag */
	public short type;
	/** general signal 1 name */
	public byte[] sgnl1_name = new byte[9];
	/** general signal 2 name */
	public byte[] sgnl2_name = new byte[9];
	/** general signal 3 name */
	public byte[] sgnl3_name = new byte[9];
	/** general signal 4 name */
	public byte[] sgnl4_name = new byte[9];
	/** general signal 5 name */
	public byte[] sgnl5_name = new byte[9];
	/** general signal 6 name */
	public byte[] sgnl6_name = new byte[9];
	/** general signal 7 name */
	public byte[] sgnl7_name = new byte[9];
	/** general signal 8 name */
	public byte[] sgnl8_name = new byte[9];
	public iodbrdna() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("datano", "type", "sgnl1_name", "sgnl2_name", "sgnl3_name", "sgnl4_name", "sgnl5_name", "sgnl6_name", "sgnl7_name", "sgnl8_name");
	}
	public iodbrdna(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbrdna implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbrdna implements Structure.ByValue {
		
	};
}