package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OUT_PBMSUBPRM extends Structure {
	public subprm_union subprm;
	public static class subprm_union extends Union {
		public byte max_slv_num;
		public byte max_slt_num;
		public byte enb_slv_num;
		public byte total_slts;
		public byte shift_mode_stat;
		public T_MAXMODLENPRM max_mod_len_prm;
		public subprm_union() {
			super();
		}
		public subprm_union(byte max_slv_num_or_max_slt_num_or_enb_slv_num_or_total_slts_or_shift_mode_stat) {
			super();
			this.shift_mode_stat = this.total_slts = this.enb_slv_num = this.max_slt_num = this.max_slv_num = max_slv_num_or_max_slt_num_or_enb_slv_num_or_total_slts_or_shift_mode_stat;
			setType(Byte.TYPE);
		}
		public subprm_union(T_MAXMODLENPRM max_mod_len_prm) {
			super();
			this.max_mod_len_prm = max_mod_len_prm;
			setType(T_MAXMODLENPRM.class);
		}
		public subprm_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends subprm_union implements Structure.ByReference {
			
		};
		public static class ByValue extends subprm_union implements Structure.ByValue {
			
		};
	};
	public OUT_PBMSUBPRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("subprm");
	}
	public OUT_PBMSUBPRM(subprm_union subprm) {
		super();
		this.subprm = subprm;
	}
	public OUT_PBMSUBPRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_PBMSUBPRM implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_PBMSUBPRM implements Structure.ByValue {
		
	};
}
