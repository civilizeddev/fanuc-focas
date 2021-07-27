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
public class iodbtlmgr_page extends Structure {
	public info_union info;
	public static class info_union extends Union {
		/** $ data no and edge no $ */
		public iodbtlmgr_edg edg;
		public page_struct page;
		public static class page_struct extends Structure {
			/** $ start data no and start edge no $ */
			public iodbtlmgr_edg s_edg;
			/** $ end data no and end edge no $ */
			public iodbtlmgr_edg e_edg;
			public page_struct() {
				super();
			}
			protected List<? > getFieldOrder() {
				return Arrays.asList("s_edg", "e_edg");
			}
			public page_struct(iodbtlmgr_edg s_edg, iodbtlmgr_edg e_edg) {
				super();
				this.s_edg = s_edg;
				this.e_edg = e_edg;
			}
			public page_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends page_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends page_struct implements Structure.ByValue {
				
			};
		};
		public info_union() {
			super();
		}
		public info_union(iodbtlmgr_edg edg) {
			super();
			this.edg = edg;
			setType(iodbtlmgr_edg.class);
		}
		public info_union(page_struct page) {
			super();
			this.page = page;
			setType(page_struct.class);
		}
		public info_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends info_union implements Structure.ByReference {
			
		};
		public static class ByValue extends info_union implements Structure.ByValue {
			
		};
	};
	public iodbtlmgr_page() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("info");
	}
	public iodbtlmgr_page(info_union info) {
		super();
		this.info = info;
	}
	public iodbtlmgr_page(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbtlmgr_page implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbtlmgr_page implements Structure.ByValue {
		
	};
}
