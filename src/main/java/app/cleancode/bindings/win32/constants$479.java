// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$479 {

    static final FunctionDescriptor CertOpenServerOcspResponse$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertOpenServerOcspResponse$MH = RuntimeHelper.downcallHandle(
        "CertOpenServerOcspResponse",
        constants$479.CertOpenServerOcspResponse$FUNC
    );
    static final FunctionDescriptor CertAddRefServerOcspResponse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddRefServerOcspResponse$MH = RuntimeHelper.downcallHandle(
        "CertAddRefServerOcspResponse",
        constants$479.CertAddRefServerOcspResponse$FUNC
    );
    static final FunctionDescriptor CertCloseServerOcspResponse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCloseServerOcspResponse$MH = RuntimeHelper.downcallHandle(
        "CertCloseServerOcspResponse",
        constants$479.CertCloseServerOcspResponse$FUNC
    );
    static final FunctionDescriptor CertGetServerOcspResponseContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetServerOcspResponseContext$MH = RuntimeHelper.downcallHandle(
        "CertGetServerOcspResponseContext",
        constants$479.CertGetServerOcspResponseContext$FUNC
    );
    static final FunctionDescriptor CertAddRefServerOcspResponseContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddRefServerOcspResponseContext$MH = RuntimeHelper.downcallHandle(
        "CertAddRefServerOcspResponseContext",
        constants$479.CertAddRefServerOcspResponseContext$FUNC
    );
    static final FunctionDescriptor CertFreeServerOcspResponseContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeServerOcspResponseContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeServerOcspResponseContext",
        constants$479.CertFreeServerOcspResponseContext$FUNC
    );
}

