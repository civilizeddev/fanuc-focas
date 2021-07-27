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
public class odbsv2_grp5 extends Structure {
	public short ps_dgn;
	public short ps_sub_dgn;
	public short sv_dgn;
	public byte ps_int_tmp;
	public byte ps_sink_tmp;
	public byte sv_int_tmp;
	public byte sv_sink_tmp;
	public byte amp_grp;
	public byte amp_slv;
	public odbsv2_grp5() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ps_dgn", "ps_sub_dgn", "sv_dgn", "ps_int_tmp", "ps_sink_tmp", "sv_int_tmp", "sv_sink_tmp", "amp_grp", "amp_slv");
	}
	public odbsv2_grp5(short ps_dgn, short ps_sub_dgn, short sv_dgn, byte ps_int_tmp, byte ps_sink_tmp, byte sv_int_tmp, byte sv_sink_tmp, byte amp_grp, byte amp_slv) {
		super();
		this.ps_dgn = ps_dgn;
		this.ps_sub_dgn = ps_sub_dgn;
		this.sv_dgn = sv_dgn;
		this.ps_int_tmp = ps_int_tmp;
		this.ps_sink_tmp = ps_sink_tmp;
		this.sv_int_tmp = sv_int_tmp;
		this.sv_sink_tmp = sv_sink_tmp;
		this.amp_grp = amp_grp;
		this.amp_slv = amp_slv;
	}
	public odbsv2_grp5(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsv2_grp5 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsv2_grp5 implements Structure.ByValue {
		
	};
}
