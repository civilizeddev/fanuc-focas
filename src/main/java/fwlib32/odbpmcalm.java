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
public class odbpmcalm extends Structure {
	/** alarm message */
	public byte[] almmsg = new byte[128];
	public odbpmcalm() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("almmsg");
	}
	public odbpmcalm(byte almmsg[]) {
		super();
		if ((almmsg.length != this.almmsg.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.almmsg = almmsg;
	}
	public odbpmcalm(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpmcalm implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpmcalm implements Structure.ByValue {
		
	};
}