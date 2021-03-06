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
public class unsolicmsg_type_msg extends Structure {
	public short type;
	public byte[] dummy1 = new byte[2];
	public msg_union msg;
	public static class msg_union extends Union {
		public pmc_struct pmc;
		public macro_struct macro;
		public static class pmc_struct extends Structure {
			public short path;
			public byte[] dummy2 = new byte[2];
			public NativeLong size;
			public Pointer data;
			public pmc_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("path", "dummy2", "size", "data");
			}
			public pmc_struct(short path, byte dummy2[], NativeLong size, Pointer data) {
				super();
				this.path = path;
				if ((dummy2.length != this.dummy2.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.dummy2 = dummy2;
				this.size = size;
				this.data = data;
			}
			public pmc_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends pmc_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends pmc_struct implements Structure.ByValue {
				
			};
		};
		public static class macro_struct extends Structure {
			public short path;
			public byte[] dummy3 = new byte[2];
			public NativeLong num;
			public Pointer data;
			public macro_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("path", "dummy3", "num", "data");
			}
			public macro_struct(short path, byte dummy3[], NativeLong num, Pointer data) {
				super();
				this.path = path;
				if ((dummy3.length != this.dummy3.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.dummy3 = dummy3;
				this.num = num;
				this.data = data;
			}
			public macro_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends macro_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends macro_struct implements Structure.ByValue {
				
			};
		};
		public msg_union() {
			super();
		}
		public msg_union(pmc_struct pmc) {
			super();
			this.pmc = pmc;
			setType(pmc_struct.class);
		}
		public msg_union(macro_struct macro) {
			super();
			this.macro = macro;
			setType(macro_struct.class);
		}
		public msg_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends msg_union implements Structure.ByReference {
			
		};
		public static class ByValue extends msg_union implements Structure.ByValue {
			
		};
	};
	public unsolicmsg_type_msg() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("type", "dummy1", "msg");
	}
	public unsolicmsg_type_msg(short type, byte dummy1[], msg_union msg) {
		super();
		this.type = type;
		if ((dummy1.length != this.dummy1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy1 = dummy1;
		this.msg = msg;
	}
	public unsolicmsg_type_msg(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends unsolicmsg_type_msg implements Structure.ByReference {
		
	};
	public static class ByValue extends unsolicmsg_type_msg implements Structure.ByValue {
		
	};
}
