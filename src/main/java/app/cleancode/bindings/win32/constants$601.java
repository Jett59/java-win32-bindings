// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$601 {

    static final FunctionDescriptor CertEnumCTLsInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumCTLsInStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumCTLsInStore",
        constants$601.CertEnumCTLsInStore$FUNC
    );
    static final FunctionDescriptor CertFindSubjectInCTL$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertFindSubjectInCTL$MH = RuntimeHelper.downcallHandle(
        "CertFindSubjectInCTL",
        constants$601.CertFindSubjectInCTL$FUNC
    );
    static final FunctionDescriptor CertFindCTLInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFindCTLInStore$MH = RuntimeHelper.downcallHandle(
        "CertFindCTLInStore",
        constants$601.CertFindCTLInStore$FUNC
    );
    static final FunctionDescriptor CertAddEncodedCTLToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddEncodedCTLToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddEncodedCTLToStore",
        constants$601.CertAddEncodedCTLToStore$FUNC
    );
    static final FunctionDescriptor CertAddCTLContextToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddCTLContextToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddCTLContextToStore",
        constants$601.CertAddCTLContextToStore$FUNC
    );
    static final FunctionDescriptor CertSerializeCTLStoreElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSerializeCTLStoreElement$MH = RuntimeHelper.downcallHandle(
        "CertSerializeCTLStoreElement",
        constants$601.CertSerializeCTLStoreElement$FUNC
    );
}


