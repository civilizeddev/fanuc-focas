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
public class alminfo extends Structure {
	public u_union u;
	public static class u_union extends Union {
		public alm1_struct alm1;
		public alm2_struct alm2;
		public static class alm1_struct extends Structure {
			public fwlib32.alminfo.u_union.alm1_struct.alm_struct[] alm = new fwlib32.alminfo.u_union.alm1_struct.alm_struct[5];
			public NativeLong data_end;
			public static class alm_struct extends Structure {
				public NativeLong axis;
				public short alm_no;
				public alm_struct() {
					super();
				}
				protected List<String> getFieldOrder() {
					return Arrays.asList("axis", "alm_no");
				}
				public alm_struct(NativeLong axis, short alm_no) {
					super();
					this.axis = axis;
					this.alm_no = alm_no;
				}
				public alm_struct(Pointer peer) {
					super(peer);
				}
				public static class ByReference extends alm_struct implements Structure.ByReference {
					
				};
				public static class ByValue extends alm_struct implements Structure.ByValue {
					
				};
			};
			public alm1_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("alm", "data_end");
			}
			public alm1_struct(fwlib32.alminfo.u_union.alm1_struct.alm_struct alm[], NativeLong data_end) {
				super();
				if ((alm.length != this.alm.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.alm = alm;
				this.data_end = data_end;
			}
			public alm1_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends alm1_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends alm1_struct implements Structure.ByValue {
				
			};
		};
		public static class alm2_struct extends Structure {
			public fwlib32.alminfo.u_union.alm1_struct.alm_struct[] alm = new fwlib32.alminfo.u_union.alm1_struct.alm_struct[5];
			public NativeLong data_end;
			public static class alm_struct extends Structure {
				public NativeLong axis;
				public short alm_no;
				public short msg_len;
				public byte[] alm_msg = new byte[32];
				public alm_struct() {
					super();
				}
				protected List<String> getFieldOrder() {
					return Arrays.asList("axis", "alm_no", "msg_len", "alm_msg");
				}
				public alm_struct(NativeLong axis, short alm_no, short msg_len, byte alm_msg[]) {
					super();
					this.axis = axis;
					this.alm_no = alm_no;
					this.msg_len = msg_len;
					if ((alm_msg.length != this.alm_msg.length)) 
						throw new IllegalArgumentException("Wrong array size !");
					this.alm_msg = alm_msg;
				}
				public alm_struct(Pointer peer) {
					super(peer);
				}
				public static class ByReference extends alm_struct implements Structure.ByReference {
					
				};
				public static class ByValue extends alm_struct implements Structure.ByValue {
					
				};
			};
			public alm2_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("alm", "data_end");
			}
			public alm2_struct(fwlib32.alminfo.u_union.alm1_struct.alm_struct alm[], NativeLong data_end) {
				super();
				if ((alm.length != this.alm.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.alm = alm;
				this.data_end = data_end;
			}
			public alm2_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends alm2_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends alm2_struct implements Structure.ByValue {
				
			};
		};
		public u_union() {
			super();
		}
		public u_union(alm1_struct alm1) {
			super();
			this.alm1 = alm1;
			setType(alm1_struct.class);
		}
		public u_union(alm2_struct alm2) {
			super();
			this.alm2 = alm2;
			setType(alm2_struct.class);
		}
		public u_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends u_union implements Structure.ByReference {
			
		};
		public static class ByValue extends u_union implements Structure.ByValue {
			
		};
	};
	public alminfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("u");
	}
	public alminfo(u_union u) {
		super();
		this.u = u;
	}
	public alminfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends alminfo implements Structure.ByReference {
		
	};
	public static class ByValue extends alminfo implements Structure.ByValue {
		
	};
}
