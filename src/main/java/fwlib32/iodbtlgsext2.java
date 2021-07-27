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
public class iodbtlgsext2 extends Structure {
	/** tool data1 */
	public NativeLong data1;
	/** tool data2 */
	public NativeLong data2;
	/** tool data3 */
	public NativeLong data3;
	/** tool data4 */
	public NativeLong data4;
	/** tool data5 */
	public NativeLong data5;
	/** tool data6 */
	public NativeLong data6;
	/** tool data7 */
	public NativeLong data7;
	/** tool data8 */
	public NativeLong data8;
	/** tool data9 */
	public NativeLong data9;
	/** tool data10 */
	public NativeLong data10;
	/** tool kind */
	public byte tooltype;
	/** attach */
	public byte install;
	/** holder */
	public byte holder;
	/** tool name */
	public byte[] toolname = new byte[9];
	public iodbtlgsext2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "tooltype", "install", "holder", "toolname");
	}
	public iodbtlgsext2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbtlgsext2 implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbtlgsext2 implements Structure.ByValue {
		
	};
}