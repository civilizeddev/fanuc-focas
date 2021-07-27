package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class odbmdipo8 extends Structure {
	/** exec. program number */
	public NativeLong mdiprog;
	/** exec. pointer */
	public NativeLong mdipntr;
	/** prepare program number */
	public NativeLong crntprog;
	/** prepare pointer */
	public NativeLong crntpntr;
	public odbmdipo8() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("mdiprog", "mdipntr", "crntprog", "crntpntr");
	}
	public odbmdipo8(NativeLong mdiprog, NativeLong mdipntr, NativeLong crntprog, NativeLong crntpntr) {
		super();
		this.mdiprog = mdiprog;
		this.mdipntr = mdipntr;
		this.crntprog = crntprog;
		this.crntpntr = crntpntr;
	}
	public odbmdipo8(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbmdipo8 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbmdipo8 implements Structure.ByValue {
		
	};
}
