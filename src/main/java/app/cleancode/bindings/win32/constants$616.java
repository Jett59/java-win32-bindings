// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$616 {

    static final FunctionDescriptor PFN_IMPORT_PRIV_KEY_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_IMPORT_PRIV_KEY_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$616.PFN_IMPORT_PRIV_KEY_FUNC$FUNC
    );
    static final FunctionDescriptor CryptImportPKCS8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("PrivateKey"),
            Constants$root.C_POINTER$LAYOUT.withName("pResolvehCryptProvFunc"),
            Constants$root.C_POINTER$LAYOUT.withName("pVoidResolveFunc"),
            Constants$root.C_POINTER$LAYOUT.withName("pDecryptPrivateKeyFunc"),
            Constants$root.C_POINTER$LAYOUT.withName("pVoidDecryptFunc")
        ).withName("_CRYPT_PKCS8_IMPORT_PARAMS"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptImportPKCS8$MH = RuntimeHelper.downcallHandle(
        "CryptImportPKCS8",
        constants$616.CryptImportPKCS8$FUNC
    );
    static final FunctionDescriptor PFN_EXPORT_PRIV_KEY_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_EXPORT_PRIV_KEY_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$616.PFN_EXPORT_PRIV_KEY_FUNC$FUNC
    );
    static final FunctionDescriptor CryptExportPKCS8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptExportPKCS8$MH = RuntimeHelper.downcallHandle(
        "CryptExportPKCS8",
        constants$616.CryptExportPKCS8$FUNC
    );
    static final FunctionDescriptor CryptExportPKCS8Ex$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptExportPKCS8Ex$MH = RuntimeHelper.downcallHandle(
        "CryptExportPKCS8Ex",
        constants$616.CryptExportPKCS8Ex$FUNC
    );
}


