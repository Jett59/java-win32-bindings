// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$599 {

    static final FunctionDescriptor CertDeleteCertificateFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDeleteCertificateFromStore$MH = RuntimeHelper.downcallHandle(
        "CertDeleteCertificateFromStore",
        constants$599.CertDeleteCertificateFromStore$FUNC
    );
    static final FunctionDescriptor CertAddEncodedCRLToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddEncodedCRLToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddEncodedCRLToStore",
        constants$599.CertAddEncodedCRLToStore$FUNC
    );
    static final FunctionDescriptor CertAddCRLContextToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddCRLContextToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddCRLContextToStore",
        constants$599.CertAddCRLContextToStore$FUNC
    );
    static final FunctionDescriptor CertDeleteCRLFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDeleteCRLFromStore$MH = RuntimeHelper.downcallHandle(
        "CertDeleteCRLFromStore",
        constants$599.CertDeleteCRLFromStore$FUNC
    );
    static final FunctionDescriptor CertSerializeCertificateStoreElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSerializeCertificateStoreElement$MH = RuntimeHelper.downcallHandle(
        "CertSerializeCertificateStoreElement",
        constants$599.CertSerializeCertificateStoreElement$FUNC
    );
    static final FunctionDescriptor CertSerializeCRLStoreElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSerializeCRLStoreElement$MH = RuntimeHelper.downcallHandle(
        "CertSerializeCRLStoreElement",
        constants$599.CertSerializeCRLStoreElement$FUNC
    );
}


