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
public class iodbmmiconcstmstring extends Structure {
	public odbmmscrninf scrninf;
	public byte[] string = new byte[13];
	public byte[] reserve = new byte[3];
	public iodbmmiconcstmstring() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("scrninf", "string", "reserve");
	}
	public iodbmmiconcstmstring(odbmmscrninf scrninf, byte string[], byte reserve[]) {
		super();
		this.scrninf = scrninf;
		if ((string.length != this.string.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.string = string;
		if ((reserve.length != this.reserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve = reserve;
	}
	public iodbmmiconcstmstring(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbmmiconcstmstring implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbmmiconcstmstring implements Structure.ByValue {
		
	};
}
