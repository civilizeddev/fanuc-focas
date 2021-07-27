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
public class odbpminf2 extends Structure {
	public NativeLong use_no1;
	public NativeLong use_no2;
	public NativeLong use_no20;
	public short v1_type;
	public short v2_type;
	public short v20_type;
	public odbpminf2() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("use_no1", "use_no2", "use_no20", "v1_type", "v2_type", "v20_type");
	}
	public odbpminf2(NativeLong use_no1, NativeLong use_no2, NativeLong use_no20, short v1_type, short v2_type, short v20_type) {
		super();
		this.use_no1 = use_no1;
		this.use_no2 = use_no2;
		this.use_no20 = use_no20;
		this.v1_type = v1_type;
		this.v2_type = v2_type;
		this.v20_type = v20_type;
	}
	public odbpminf2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpminf2 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpminf2 implements Structure.ByValue {
		
	};
}
