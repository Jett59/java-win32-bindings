// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$96 {

    static final FunctionDescriptor PFE_EXPORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFE_EXPORT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$96.PFE_EXPORT_FUNC$FUNC
    );
    static final FunctionDescriptor PFE_IMPORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFE_IMPORT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$96.PFE_IMPORT_FUNC$FUNC
    );
    static final FunctionDescriptor OpenEncryptedFileRawA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEncryptedFileRawA$MH = RuntimeHelper.downcallHandle(
        "OpenEncryptedFileRawA",
        constants$96.OpenEncryptedFileRawA$FUNC
    );
    static final FunctionDescriptor OpenEncryptedFileRawW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEncryptedFileRawW$MH = RuntimeHelper.downcallHandle(
        "OpenEncryptedFileRawW",
        constants$96.OpenEncryptedFileRawW$FUNC
    );
    static final FunctionDescriptor ReadEncryptedFileRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadEncryptedFileRaw$MH = RuntimeHelper.downcallHandle(
        "ReadEncryptedFileRaw",
        constants$96.ReadEncryptedFileRaw$FUNC
    );
}


