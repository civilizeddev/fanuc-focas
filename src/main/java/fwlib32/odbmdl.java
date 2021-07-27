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
public class odbmdl extends Structure {
	public short datano;
	public short type;
	public modal_union modal;
	public static class modal_union extends Union {
		public byte g_data;
		public byte[] g_rdata = new byte[35];
		public byte[] g_1shot = new byte[4];
		public aux_struct aux;
		public odbmdl.modal_union.raux1_struct[] raux1 = new odbmdl.modal_union.raux1_struct[27];
		public odbmdl.modal_union.raux2_struct[] raux2 = new odbmdl.modal_union.raux2_struct[32];
		public static class aux_struct extends Structure {
			public NativeLong aux_data;
			public byte flag1;
			public byte flag2;
			public aux_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("aux_data", "flag1", "flag2");
			}
			public aux_struct(NativeLong aux_data, byte flag1, byte flag2) {
				super();
				this.aux_data = aux_data;
				this.flag1 = flag1;
				this.flag2 = flag2;
			}
			public aux_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends aux_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends aux_struct implements Structure.ByValue {
				
			};
		};
		public static class raux1_struct extends Structure {
			public NativeLong aux_data;
			public byte flag1;
			public byte flag2;
			public raux1_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("aux_data", "flag1", "flag2");
			}
			public raux1_struct(NativeLong aux_data, byte flag1, byte flag2) {
				super();
				this.aux_data = aux_data;
				this.flag1 = flag1;
				this.flag2 = flag2;
			}
			public raux1_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends raux1_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends raux1_struct implements Structure.ByValue {
				
			};
		};
		public static class raux2_struct extends Structure {
			public NativeLong aux_data;
			public byte flag1;
			public byte flag2;
			public raux2_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("aux_data", "flag1", "flag2");
			}
			public raux2_struct(NativeLong aux_data, byte flag1, byte flag2) {
				super();
				this.aux_data = aux_data;
				this.flag1 = flag1;
				this.flag2 = flag2;
			}
			public raux2_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends raux2_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends raux2_struct implements Structure.ByValue {
				
			};
		};
		public modal_union() {
			super();
		}
		public modal_union(byte g_data) {
			super();
			this.g_data = g_data;
			setType(Byte.TYPE);
		}
		public modal_union(byte g_rdata_or_g_1shot[]) {
			super();
			if ((g_rdata_or_g_1shot.length != this.g_rdata.length) || (g_rdata_or_g_1shot.length != this.g_1shot.length))
				throw new IllegalArgumentException("Wrong array size !");
			this.g_1shot = this.g_rdata = g_rdata_or_g_1shot;
			setType(byte[].class);
		}
		public modal_union(aux_struct aux) {
			super();
			this.aux = aux;
			setType(aux_struct.class);
		}
		public modal_union(odbmdl.modal_union.raux1_struct raux1[]) {
			super();
			if ((raux1.length != this.raux1.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.raux1 = raux1;
			setType(odbmdl.modal_union.raux1_struct[].class);
		}
		public modal_union(odbmdl.modal_union.raux2_struct raux2[]) {
			super();
			if ((raux2.length != this.raux2.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.raux2 = raux2;
			setType(odbmdl.modal_union.raux2_struct[].class);
		}
		public modal_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends modal_union implements Structure.ByReference {
			
		};
		public static class ByValue extends modal_union implements Structure.ByValue {
			
		};
	};
	public odbmdl() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("datano", "type", "modal");
	}
	public odbmdl(short datano, short type, modal_union modal) {
		super();
		this.datano = datano;
		this.type = type;
		this.modal = modal;
	}
	public odbmdl(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbmdl implements Structure.ByReference {
		
	};
	public static class ByValue extends odbmdl implements Structure.ByValue {
		
	};
}