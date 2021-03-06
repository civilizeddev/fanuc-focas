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
public class iodbsigad extends Structure {
	public byte adr;
	public byte reserve;
	public short no;
	public short size;
	public iodbsigad() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("adr", "reserve", "no", "size");
	}
	public iodbsigad(byte adr, byte reserve, short no, short size) {
		super();
		this.adr = adr;
		this.reserve = reserve;
		this.no = no;
		this.size = size;
	}
	public iodbsigad(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbsigad implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbsigad implements Structure.ByValue {
		
	};
}
