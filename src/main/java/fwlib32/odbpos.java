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
public class odbpos extends Structure {
	/** absolute position */
	public poselm abs;
	/** machine position */
	public poselm mach;
	/** relative position */
	public poselm rel;
	/** distance position */
	public poselm dist;
	public odbpos() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("abs", "mach", "rel", "dist");
	}
	public odbpos(poselm abs, poselm mach, poselm rel, poselm dist) {
		super();
		this.abs = abs;
		this.mach = mach;
		this.rel = rel;
		this.dist = dist;
	}
	public odbpos(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpos implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpos implements Structure.ByValue {
		
	};
}
