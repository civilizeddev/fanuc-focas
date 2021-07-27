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
public class iodbslvprm2 extends Structure {
	public short dis_enb;
	public short ident_no;
	public byte slv_flag;
	public byte slv_type;
	public byte[] reserve1 = new byte[12];
	public byte slv_stat;
	public byte wd_fact1;
	public byte wd_fact2;
	public byte min_tsdr;
	public byte reserve2;
	public byte grp_ident;
	public short user_plen;
	public byte[] user_pdata = new byte[206];
	public short cnfg_dlen;
	public byte[] cnfg_data = new byte[126];
	public short slv_ulen;
	public byte[] slv_udata = new byte[30];
	public byte[] reserve3 = new byte[8];
	public iodbslvprm2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dis_enb", "ident_no", "slv_flag", "slv_type", "reserve1", "slv_stat", "wd_fact1", "wd_fact2", "min_tsdr", "reserve2", "grp_ident", "user_plen", "user_pdata", "cnfg_dlen", "cnfg_data", "slv_ulen", "slv_udata", "reserve3");
	}
	public iodbslvprm2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbslvprm2 implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbslvprm2 implements Structure.ByValue {
		
	};
}
