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
public class tagODBFSSBMT extends Structure {
	/** axis number */
	public short axis_num;
	/** reserved */
	public short reserve;
	/** axis name */
	public byte[] axis_name = new byte[4];
	/** amp name */
	public byte[] amp_name = new byte[8];
	/** amp series name */
	public byte[] amp_seires = new byte[8];
	/** amp unit type */
	public byte[] amp_unit = new byte[8];
	/** amp maximum current */
	public byte[] amp_cur = new byte[8];
	/** amp version */
	public byte[] amp_edt = new byte[8];
	/** amp axis */
	public short amp_axis_num;
	/** amp tested year */
	public short test_year;
	/** amp tested month */
	public short test_month;
	/** amp tested date */
	public short test_day;
	/** amp serial number */
	public short amp_mainte;
	public tagODBFSSBMT() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("axis_num", "reserve", "axis_name", "amp_name", "amp_seires", "amp_unit", "amp_cur", "amp_edt", "amp_axis_num", "test_year", "test_month", "test_day", "amp_mainte");
	}
	public tagODBFSSBMT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBFSSBMT implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBFSSBMT implements Structure.ByValue {
		
	};
}
