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
public class iodbto extends Structure {
	/** start offset number */
	public short datano_s;
	/** offset type */
	public short type;
	/** end offset number */
	public short datano_e;
	public u_union u;
	public static class u_union extends Union {
		/** M Each */
		public NativeLong[] m_ofs = new NativeLong[5];
		/** M-A All */
		public NativeLong[] m_ofs_a = new NativeLong[5];
		/** M-B All */
		public NativeLong[] m_ofs_b = new NativeLong[10];
		/** M-C All */
		public NativeLong[] m_ofs_c = new NativeLong[20];
		public fwlib32.iodbto.u_union.m_ofs_at_struct[] m_ofs_at = new fwlib32.iodbto.u_union.m_ofs_at_struct[5];
		public fwlib32.iodbto.u_union.m_ofs_bt_struct[] m_ofs_bt = new fwlib32.iodbto.u_union.m_ofs_bt_struct[5];
		public fwlib32.iodbto.u_union.m_ofs_ct_struct[] m_ofs_ct = new fwlib32.iodbto.u_union.m_ofs_ct_struct[5];
		/** T Each, 2-byte */
		public short[] t_tip = new short[5];
		/** T Each, 4-byte */
		public NativeLong[] t_ofs = new NativeLong[5];
		public fwlib32.iodbto.u_union.t_ofs_a_struct[] t_ofs_a = new fwlib32.iodbto.u_union.t_ofs_a_struct[5];
		public fwlib32.iodbto.u_union.t_ofs_b_struct[] t_ofs_b = new fwlib32.iodbto.u_union.t_ofs_b_struct[5];
		/** T-2nd geometry */
		public NativeLong[] t_ofs_2g = new NativeLong[15];
		/** M-CornerR */
		public NativeLong[] m_ofs_cnr = new NativeLong[10];
		public fwlib32.iodbto.u_union.t_ofs_ex_struct[] t_ofs_ex = new fwlib32.iodbto.u_union.t_ofs_ex_struct[5];
		public static class m_ofs_at_struct extends Structure {
			public short tip;
			public NativeLong[] data = new NativeLong[1];
			public m_ofs_at_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("tip", "data");
			}
			public m_ofs_at_struct(short tip, NativeLong data[]) {
				super();
				this.tip = tip;
				if ((data.length != this.data.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.data = data;
			}
			public m_ofs_at_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends m_ofs_at_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends m_ofs_at_struct implements Structure.ByValue {
				
			};
		};
		public static class m_ofs_bt_struct extends Structure {
			public short tip;
			public NativeLong[] data = new NativeLong[2];
			public m_ofs_bt_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("tip", "data");
			}
			public m_ofs_bt_struct(short tip, NativeLong data[]) {
				super();
				this.tip = tip;
				if ((data.length != this.data.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.data = data;
			}
			public m_ofs_bt_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends m_ofs_bt_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends m_ofs_bt_struct implements Structure.ByValue {
				
			};
		};
		public static class m_ofs_ct_struct extends Structure {
			public short tip;
			public NativeLong[] data = new NativeLong[4];
			public m_ofs_ct_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("tip", "data");
			}
			public m_ofs_ct_struct(short tip, NativeLong data[]) {
				super();
				this.tip = tip;
				if ((data.length != this.data.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.data = data;
			}
			public m_ofs_ct_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends m_ofs_ct_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends m_ofs_ct_struct implements Structure.ByValue {
				
			};
		};
		public static class t_ofs_a_struct extends Structure {
			public short tip;
			public NativeLong[] data = new NativeLong[4];
			public t_ofs_a_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("tip", "data");
			}
			public t_ofs_a_struct(short tip, NativeLong data[]) {
				super();
				this.tip = tip;
				if ((data.length != this.data.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.data = data;
			}
			public t_ofs_a_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends t_ofs_a_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends t_ofs_a_struct implements Structure.ByValue {
				
			};
		};
		public static class t_ofs_b_struct extends Structure {
			public short tip;
			public NativeLong[] data = new NativeLong[8];
			public t_ofs_b_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("tip", "data");
			}
			public t_ofs_b_struct(short tip, NativeLong data[]) {
				super();
				this.tip = tip;
				if ((data.length != this.data.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.data = data;
			}
			public t_ofs_b_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends t_ofs_b_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends t_ofs_b_struct implements Structure.ByValue {
				
			};
		};
		public static class t_ofs_ex_struct extends Structure {
			public NativeLong[] data = new NativeLong[2];
			public t_ofs_ex_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("data");
			}
			public t_ofs_ex_struct(NativeLong data[]) {
				super();
				if ((data.length != this.data.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.data = data;
			}
			public t_ofs_ex_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends t_ofs_ex_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends t_ofs_ex_struct implements Structure.ByValue {
				
			};
		};
		public u_union() {
			super();
		}
		public u_union(NativeLong m_ofs_or_m_ofs_a_or_m_ofs_b_or_m_ofs_c_or_t_ofs_or_t_ofs_2g_or_m_ofs_cnr[]) {
			super();
			if ((m_ofs_or_m_ofs_a_or_m_ofs_b_or_m_ofs_c_or_t_ofs_or_t_ofs_2g_or_m_ofs_cnr.length != this.m_ofs_or_m_ofs_a_or_m_ofs_b_or_m_ofs_c_or_t_ofs_or_t_ofs_2g_or_m_ofs_cnr.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.m_ofs_cnr = this.t_ofs_2g = this.t_ofs = this.m_ofs_c = this.m_ofs_b = this.m_ofs_a = this.m_ofs = m_ofs_or_m_ofs_a_or_m_ofs_b_or_m_ofs_c_or_t_ofs_or_t_ofs_2g_or_m_ofs_cnr;
			setType(NativeLong[].class);
		}
		public u_union(fwlib32.iodbto.u_union.m_ofs_at_struct m_ofs_at[]) {
			super();
			if ((m_ofs_at.length != this.m_ofs_at.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.m_ofs_at = m_ofs_at;
			setType(fwlib32.iodbto.u_union.m_ofs_at_struct[].class);
		}
		public u_union(fwlib32.iodbto.u_union.m_ofs_bt_struct m_ofs_bt[]) {
			super();
			if ((m_ofs_bt.length != this.m_ofs_bt.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.m_ofs_bt = m_ofs_bt;
			setType(fwlib32.iodbto.u_union.m_ofs_bt_struct[].class);
		}
		public u_union(fwlib32.iodbto.u_union.m_ofs_ct_struct m_ofs_ct[]) {
			super();
			if ((m_ofs_ct.length != this.m_ofs_ct.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.m_ofs_ct = m_ofs_ct;
			setType(fwlib32.iodbto.u_union.m_ofs_ct_struct[].class);
		}
		public u_union(short t_tip[]) {
			super();
			if ((t_tip.length != this.t_tip.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.t_tip = t_tip;
			setType(short[].class);
		}
		public u_union(fwlib32.iodbto.u_union.t_ofs_a_struct t_ofs_a[]) {
			super();
			if ((t_ofs_a.length != this.t_ofs_a.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.t_ofs_a = t_ofs_a;
			setType(fwlib32.iodbto.u_union.t_ofs_a_struct[].class);
		}
		public u_union(fwlib32.iodbto.u_union.t_ofs_b_struct t_ofs_b[]) {
			super();
			if ((t_ofs_b.length != this.t_ofs_b.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.t_ofs_b = t_ofs_b;
			setType(fwlib32.iodbto.u_union.t_ofs_b_struct[].class);
		}
		public u_union(fwlib32.iodbto.u_union.t_ofs_ex_struct t_ofs_ex[]) {
			super();
			if ((t_ofs_ex.length != this.t_ofs_ex.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.t_ofs_ex = t_ofs_ex;
			setType(fwlib32.iodbto.u_union.t_ofs_ex_struct[].class);
		}
		public u_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends u_union implements Structure.ByReference {
			
		};
		public static class ByValue extends u_union implements Structure.ByValue {
			
		};
	};
	public iodbto() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("datano_s", "type", "datano_e", "u");
	}
	public iodbto(short datano_s, short type, short datano_e, u_union u) {
		super();
		this.datano_s = datano_s;
		this.type = type;
		this.datano_e = datano_e;
		this.u = u;
	}
	public iodbto(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbto implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbto implements Structure.ByValue {
		
	};
}
