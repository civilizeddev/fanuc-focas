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
public class opmsg2 extends Structure {
	/** operator's message number */
	public short datano;
	/** operator's message type */
	public short type;
	/** message string length */
	public short char_num;
	/** operator's message string */
	public byte[] data = new byte[64];
	public opmsg2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("datano", "type", "char_num", "data");
	}
	public opmsg2(short datano, short type, short char_num, byte data[]) {
		super();
		this.datano = datano;
		this.type = type;
		this.char_num = char_num;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public opmsg2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends opmsg2 implements Structure.ByReference {
		
	};
	public static class ByValue extends opmsg2 implements Structure.ByValue {
		
	};
}
