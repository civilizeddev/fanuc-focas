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
public class odbsyss extends Structure {
	public byte[] slot_no_p = new byte[16];
	public byte[] slot_no_l = new byte[16];
	public short[] module_id = new short[16];
	public short[] soft_id = new short[16];
	public byte[] soft_series = new byte[((16) * (5))];
	public byte[] soft_version = new byte[((16) * (5))];
	public short soft_inst;
	public byte[] boot_ser = new byte[5];
	public byte[] boot_ver = new byte[5];
	public byte[] servo_ser = new byte[5];
	public byte[] servo_ver = new byte[5];
	public byte[] pmc_ser = new byte[5];
	public byte[] pmc_ver = new byte[5];
	public byte[] ladder_ser = new byte[5];
	public byte[] ladder_ver = new byte[5];
	public byte[] mcrlib_ser = new byte[5];
	public byte[] mcrlib_ver = new byte[5];
	public byte[] mcrapl_ser = new byte[5];
	public byte[] mcrapl_ver = new byte[5];
	public byte[] spl1_ser = new byte[5];
	public byte[] spl1_ver = new byte[5];
	public byte[] spl2_ser = new byte[5];
	public byte[] spl2_ver = new byte[5];
	public byte[] spl3_ser = new byte[5];
	public byte[] spl3_ver = new byte[5];
	public byte[] c_exelib_ser = new byte[5];
	public byte[] c_exelib_ver = new byte[5];
	public byte[] c_exeapl_ser = new byte[5];
	public byte[] c_exeapl_ver = new byte[5];
	public byte[] int_vga_ser = new byte[5];
	public byte[] int_vga_ver = new byte[5];
	public byte[] out_vga_ser = new byte[5];
	public byte[] out_vga_ver = new byte[5];
	public byte[] pmm_ser = new byte[5];
	public byte[] pmm_ver = new byte[5];
	public byte[] pmc_mng_ser = new byte[5];
	public byte[] pmc_mng_ver = new byte[5];
	public byte[] pmc_shin_ser = new byte[5];
	public byte[] pmc_shin_ver = new byte[5];
	public byte[] pmc_shout_ser = new byte[5];
	public byte[] pmc_shout_ver = new byte[5];
	public byte[] pmc_c_ser = new byte[5];
	public byte[] pmc_c_ver = new byte[5];
	public byte[] pmc_edit_ser = new byte[5];
	public byte[] pmc_edit_ver = new byte[5];
	public byte[] lddr_mng_ser = new byte[5];
	public byte[] lddr_mng_ver = new byte[5];
	public byte[] lddr_apl_ser = new byte[5];
	public byte[] lddr_apl_ver = new byte[5];
	public byte[] spl4_ser = new byte[5];
	public byte[] spl4_ver = new byte[5];
	public byte[] mcr2_ser = new byte[5];
	public byte[] mcr2_ver = new byte[5];
	public byte[] mcr3_ser = new byte[5];
	public byte[] mcr3_ver = new byte[5];
	public byte[] eth_boot_ser = new byte[5];
	public byte[] eth_boot_ver = new byte[5];
	public byte[] reserve = new byte[((8) * (5))];
	public odbsyss() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("slot_no_p", "slot_no_l", "module_id", "soft_id", "soft_series", "soft_version", "soft_inst", "boot_ser", "boot_ver", "servo_ser", "servo_ver", "pmc_ser", "pmc_ver", "ladder_ser", "ladder_ver", "mcrlib_ser", "mcrlib_ver", "mcrapl_ser", "mcrapl_ver", "spl1_ser", "spl1_ver", "spl2_ser", "spl2_ver", "spl3_ser", "spl3_ver", "c_exelib_ser", "c_exelib_ver", "c_exeapl_ser", "c_exeapl_ver", "int_vga_ser", "int_vga_ver", "out_vga_ser", "out_vga_ver", "pmm_ser", "pmm_ver", "pmc_mng_ser", "pmc_mng_ver", "pmc_shin_ser", "pmc_shin_ver", "pmc_shout_ser", "pmc_shout_ver", "pmc_c_ser", "pmc_c_ver", "pmc_edit_ser", "pmc_edit_ver", "lddr_mng_ser", "lddr_mng_ver", "lddr_apl_ser", "lddr_apl_ver", "spl4_ser", "spl4_ver", "mcr2_ser", "mcr2_ver", "mcr3_ser", "mcr3_ver", "eth_boot_ser", "eth_boot_ver", "reserve");
	}
	public odbsyss(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsyss implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsyss implements Structure.ByValue {
		
	};
}
