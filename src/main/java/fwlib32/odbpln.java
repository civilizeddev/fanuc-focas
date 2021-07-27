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
public class odbpln extends Structure {
	/** optional point on plane */
	public NativeLong[] point = new NativeLong[3];
	/** vertical vector */
	public NativeLong[] vect = new NativeLong[3];
	/** numetrical unit */
	public byte n_unit;
	/** figure form flag */
	public byte cb_form;
	public odbpln() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("point", "vect", "n_unit", "cb_form");
	}
	public odbpln(NativeLong point[], NativeLong vect[], byte n_unit, byte cb_form) {
		super();
		if ((point.length != this.point.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.point = point;
		if ((vect.length != this.vect.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.vect = vect;
		this.n_unit = n_unit;
		this.cb_form = cb_form;
	}
	public odbpln(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpln implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpln implements Structure.ByValue {
		
	};
}
