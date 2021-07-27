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
public class IODBINDEADR extends Structure {
	public byte dummy;
	public byte indi_type;
	public short indi_addr;
	public IODBINDEADR() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dummy", "indi_type", "indi_addr");
	}
	public IODBINDEADR(byte dummy, byte indi_type, short indi_addr) {
		super();
		this.dummy = dummy;
		this.indi_type = indi_type;
		this.indi_addr = indi_addr;
	}
	public IODBINDEADR(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IODBINDEADR implements Structure.ByReference {
		
	};
	public static class ByValue extends IODBINDEADR implements Structure.ByValue {
		
	};
}
