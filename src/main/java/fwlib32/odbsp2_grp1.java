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
public class odbsp2_grp1 extends Structure {
	public NativeLong motion;
	public short cmd_spd;
	public byte mode;
	public byte gear;
	public byte osel;
	public byte[] reserved = new byte[3];
	public odbsigdio sig_in;
	public odbsigdio sig_out;
	public odbsp2_grp1() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("motion", "cmd_spd", "mode", "gear", "osel", "reserved", "sig_in", "sig_out");
	}
	public odbsp2_grp1(NativeLong motion, short cmd_spd, byte mode, byte gear, byte osel, byte reserved[], odbsigdio sig_in, odbsigdio sig_out) {
		super();
		this.motion = motion;
		this.cmd_spd = cmd_spd;
		this.mode = mode;
		this.gear = gear;
		this.osel = osel;
		if ((reserved.length != this.reserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserved = reserved;
		this.sig_in = sig_in;
		this.sig_out = sig_out;
	}
	public odbsp2_grp1(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsp2_grp1 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsp2_grp1 implements Structure.ByValue {
		
	};
}
