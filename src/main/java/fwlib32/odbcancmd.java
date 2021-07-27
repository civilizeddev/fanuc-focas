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
public class odbcancmd extends Structure {
	/** P command */
	public cmnddata p_data;
	/** Q command */
	public cmnddata q_data;
	/** R command */
	public cmnddata r_data;
	/** Z command */
	public cmnddata z_data;
	public odbcancmd() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("p_data", "q_data", "r_data", "z_data");
	}
	public odbcancmd(cmnddata p_data, cmnddata q_data, cmnddata r_data, cmnddata z_data) {
		super();
		this.p_data = p_data;
		this.q_data = q_data;
		this.r_data = r_data;
		this.z_data = z_data;
	}
	public odbcancmd(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbcancmd implements Structure.ByReference {
		
	};
	public static class ByValue extends odbcancmd implements Structure.ByValue {
		
	};
}
