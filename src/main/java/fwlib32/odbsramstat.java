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
public class odbsramstat extends Structure {
	/** state of message */
	public short msg_kind;
	/** message string */
	public byte[] msg = new byte[64];
	public odbsramstat() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("msg_kind", "msg");
	}
	public odbsramstat(short msg_kind, byte msg[]) {
		super();
		this.msg_kind = msg_kind;
		if ((msg.length != this.msg.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.msg = msg;
	}
	public odbsramstat(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsramstat implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsramstat implements Structure.ByValue {
		
	};
}
