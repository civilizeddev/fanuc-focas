package fwlib32;
import com.sun.jna.NativeLong;
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
public class odbptaxfuncstat extends Structure {
	public u_union u;
	public static class u_union extends Union {
		public state1_struct state1;
		public state2_struct state2;
		public static class state1_struct extends Structure {
			public double l_value_e;
			public double l_value;
			public double time;
			public NativeLong[] m_code = new NativeLong[3];
			public short ov_time;
			public short number;
			public short next_table;
			public short skip_table;
			public short skip_signal;
			public short table_kind;
			public short master_indx_no;
			public short m_count;
			public state1_struct() {
				super();
			}
			protected List<? > getFieldOrder() {
				return Arrays.asList("l_value_e", "l_value", "time", "m_code", "ov_time", "number", "next_table", "skip_table", "skip_signal", "table_kind", "master_indx_no", "m_count");
			}
			public state1_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends state1_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends state1_struct implements Structure.ByValue {
				
			};
		};
		public static class state2_struct extends Structure {
			public double l_value_e_sub;
			public double l_value_sub;
			public NativeLong repeat_e_sub;
			public NativeLong repeat_sub;
			public short number_sub;
			public short next_table_sub;
			public short skip_table_sub;
			public short skip_signal_sub;
			public short table_kind_sub;
			public short master_indx_no_sub;
			public state2_struct() {
				super();
			}
			protected List<? > getFieldOrder() {
				return Arrays.asList("l_value_e_sub", "l_value_sub", "repeat_e_sub", "repeat_sub", "number_sub", "next_table_sub", "skip_table_sub", "skip_signal_sub", "table_kind_sub", "master_indx_no_sub");
			}
			public state2_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends state2_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends state2_struct implements Structure.ByValue {
				
			};
		};
		public u_union() {
			super();
		}
		public u_union(state1_struct state1) {
			super();
			this.state1 = state1;
			setType(state1_struct.class);
		}
		public u_union(state2_struct state2) {
			super();
			this.state2 = state2;
			setType(state2_struct.class);
		}
		public u_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends u_union implements Structure.ByReference {
			
		};
		public static class ByValue extends u_union implements Structure.ByValue {
			
		};
	};
	public odbptaxfuncstat() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("u");
	}
	public odbptaxfuncstat(u_union u) {
		super();
		this.u = u;
	}
	public odbptaxfuncstat(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbptaxfuncstat implements Structure.ByReference {
		
	};
	public static class ByValue extends odbptaxfuncstat implements Structure.ByValue {
		
	};
}
