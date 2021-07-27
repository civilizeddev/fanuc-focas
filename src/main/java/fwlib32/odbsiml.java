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
public class odbsiml extends Structure {
	public NativeLong t_code;
	public NativeLong b_code;
	public NativeLong axis_no;
	public NativeLong[] machine = new NativeLong[32];
	public NativeLong[] dec = new NativeLong[32];
	public NativeLong fscsl;
	public odbsiml() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("t_code", "b_code", "axis_no", "machine", "dec", "fscsl");
	}
	public odbsiml(NativeLong t_code, NativeLong b_code, NativeLong axis_no, NativeLong machine[], NativeLong dec[], NativeLong fscsl) {
		super();
		this.t_code = t_code;
		this.b_code = b_code;
		this.axis_no = axis_no;
		if ((machine.length != this.machine.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.machine = machine;
		if ((dec.length != this.dec.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dec = dec;
		this.fscsl = fscsl;
	}
	public odbsiml(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsiml implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsiml implements Structure.ByValue {
		
	};
}