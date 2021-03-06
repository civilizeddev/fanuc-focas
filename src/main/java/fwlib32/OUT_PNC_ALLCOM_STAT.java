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
public class OUT_PNC_ALLCOM_STAT extends Structure {
	public byte[] State = new byte[48];
	public OUT_PNC_ALLCOM_STAT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("State");
	}
	public OUT_PNC_ALLCOM_STAT(byte State[]) {
		super();
		if ((State.length != this.State.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.State = State;
	}
	public OUT_PNC_ALLCOM_STAT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_PNC_ALLCOM_STAT implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_PNC_ALLCOM_STAT implements Structure.ByValue {
		
	};
}
