// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$198 {

    static final FunctionDescriptor MFENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MFENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$198.MFENUMPROC$FUNC
    );
    static final FunctionDescriptor EnumMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumMetaFile$MH = RuntimeHelper.downcallHandle(
        "EnumMetaFile",
        constants$198.EnumMetaFile$FUNC
    );
    static final FunctionDescriptor ENHMFENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENHMFENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$198.ENHMFENUMPROC$FUNC
    );
    static final FunctionDescriptor CloseEnhMetaFile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseEnhMetaFile$MH = RuntimeHelper.downcallHandle(
        "CloseEnhMetaFile",
        constants$198.CloseEnhMetaFile$FUNC
    );
    static final FunctionDescriptor CopyEnhMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyEnhMetaFileA$MH = RuntimeHelper.downcallHandle(
        "CopyEnhMetaFileA",
        constants$198.CopyEnhMetaFileA$FUNC
    );
}

