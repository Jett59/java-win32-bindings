// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$450 {

    static final FunctionDescriptor CertAddCertificateLinkToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddCertificateLinkToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddCertificateLinkToStore",
        constants$450.CertAddCertificateLinkToStore$FUNC
    );
    static final FunctionDescriptor CertAddCRLLinkToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddCRLLinkToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddCRLLinkToStore",
        constants$450.CertAddCRLLinkToStore$FUNC
    );
    static final FunctionDescriptor CertAddCTLLinkToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddCTLLinkToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddCTLLinkToStore",
        constants$450.CertAddCTLLinkToStore$FUNC
    );
    static final FunctionDescriptor CertAddStoreToCollection$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertAddStoreToCollection$MH = RuntimeHelper.downcallHandle(
        "CertAddStoreToCollection",
        constants$450.CertAddStoreToCollection$FUNC
    );
    static final FunctionDescriptor CertRemoveStoreFromCollection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRemoveStoreFromCollection$MH = RuntimeHelper.downcallHandle(
        "CertRemoveStoreFromCollection",
        constants$450.CertRemoveStoreFromCollection$FUNC
    );
    static final FunctionDescriptor CertControlStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertControlStore$MH = RuntimeHelper.downcallHandle(
        "CertControlStore",
        constants$450.CertControlStore$FUNC
    );
}

