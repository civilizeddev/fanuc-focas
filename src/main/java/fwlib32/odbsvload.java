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
public class odbsvload extends Structure {
	/** servo load meter */
	public loadelm svload;
	public odbsvload() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("svload");
	}
	public odbsvload(loadelm svload) {
		super();
		this.svload = svload;
	}
	public odbsvload(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsvload implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsvload implements Structure.ByValue {
		
	};
}
