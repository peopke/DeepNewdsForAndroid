package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import android.util.SparseArray;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.common.util.zzc;
import com.google.android.gms.common.util.zzq;
import com.google.android.gms.common.util.zzr;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzbia extends zzbhs {
    public static final Creator<zzbia> CREATOR = new zzbib();
    private final String mClassName;
    private final int zzehz;
    private final zzbhv zzgiw;
    private final Parcel zzgjd;
    private final int zzgje = 2;
    private int zzgjf;
    private int zzgjg;

    zzbia(int i, Parcel parcel, zzbhv zzbhv) {
        this.zzehz = i;
        zzbq.checkNotNull(parcel);
        this.zzgjd = parcel;
        this.zzgiw = zzbhv;
        zzbhv zzbhv2 = this.zzgiw;
        this.mClassName = zzbhv2 == null ? null : zzbhv2.zzanj();
        this.zzgjf = 2;
    }

    private static void zza(StringBuilder stringBuilder, int i, Object obj) {
        String str = "\"";
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                stringBuilder.append(obj);
                return;
            case 7:
                stringBuilder.append(str);
                stringBuilder.append(zzq.zzha(obj.toString()));
                stringBuilder.append(str);
                return;
            case 8:
                stringBuilder.append(str);
                stringBuilder.append(zzc.zzj((byte[]) obj));
                stringBuilder.append(str);
                return;
            case 9:
                stringBuilder.append(str);
                stringBuilder.append(zzc.zzk((byte[]) obj));
                stringBuilder.append(str);
                return;
            case 10:
                zzr.zza(stringBuilder, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder stringBuilder2 = new StringBuilder(26);
                stringBuilder2.append("Unknown type = ");
                stringBuilder2.append(i);
                throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final void zza(StringBuilder stringBuilder, zzbhq<?, ?> zzbhq, Parcel parcel, int i) {
        String str = ",";
        int i2 = 0;
        if (zzbhq.zzgir) {
            stringBuilder.append("[");
            Object[] objArr = null;
            int zza;
            int readInt;
            switch (zzbhq.zzgiq) {
                case 0:
                    int[] zzw = zzbgm.zzw(parcel, i);
                    int length = zzw.length;
                    while (i2 < length) {
                        if (i2 != 0) {
                            stringBuilder.append(str);
                        }
                        stringBuilder.append(Integer.toString(zzw[i2]));
                        i2++;
                    }
                    break;
                case 1:
                    zza = zzbgm.zza(parcel, i);
                    i = parcel.dataPosition();
                    if (zza != 0) {
                        readInt = parcel.readInt();
                        objArr = new BigInteger[readInt];
                        while (i2 < readInt) {
                            objArr[i2] = new BigInteger(parcel.createByteArray());
                            i2++;
                        }
                        parcel.setDataPosition(i + zza);
                    }
                    zzb.zza(stringBuilder, objArr);
                    break;
                case 2:
                    zzb.zza(stringBuilder, zzbgm.zzx(parcel, i));
                    break;
                case 3:
                    zzb.zza(stringBuilder, zzbgm.zzy(parcel, i));
                    break;
                case 4:
                    double[] createDoubleArray;
                    zza = zzbgm.zza(parcel, i);
                    i = parcel.dataPosition();
                    if (zza != 0) {
                        createDoubleArray = parcel.createDoubleArray();
                        parcel.setDataPosition(i + zza);
                    }
                    zzb.zza(stringBuilder, createDoubleArray);
                    break;
                case 5:
                    zzb.zza(stringBuilder, zzbgm.zzz(parcel, i));
                    break;
                case 6:
                    zzb.zza(stringBuilder, zzbgm.zzv(parcel, i));
                    break;
                case 7:
                    zzb.zza(stringBuilder, zzbgm.zzaa(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] zzae = zzbgm.zzae(parcel, i);
                    i = zzae.length;
                    for (readInt = 0; readInt < i; readInt++) {
                        if (readInt > 0) {
                            stringBuilder.append(str);
                        }
                        zzae[readInt].setDataPosition(0);
                        zza(stringBuilder, zzbhq.zzanh(), zzae[readInt]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        String str2 = "\"";
        byte[] zzt;
        switch (zzbhq.zzgiq) {
            case 0:
                stringBuilder.append(zzbgm.zzg(parcel, i));
                return;
            case 1:
                stringBuilder.append(zzbgm.zzk(parcel, i));
                return;
            case 2:
                stringBuilder.append(zzbgm.zzi(parcel, i));
                return;
            case 3:
                stringBuilder.append(zzbgm.zzl(parcel, i));
                return;
            case 4:
                stringBuilder.append(zzbgm.zzn(parcel, i));
                return;
            case 5:
                stringBuilder.append(zzbgm.zzp(parcel, i));
                return;
            case 6:
                stringBuilder.append(zzbgm.zzc(parcel, i));
                return;
            case 7:
                String zzq = zzbgm.zzq(parcel, i);
                stringBuilder.append(str2);
                stringBuilder.append(zzq.zzha(zzq));
                stringBuilder.append(str2);
                return;
            case 8:
                zzt = zzbgm.zzt(parcel, i);
                stringBuilder.append(str2);
                stringBuilder.append(zzc.zzj(zzt));
                stringBuilder.append(str2);
                return;
            case 9:
                zzt = zzbgm.zzt(parcel, i);
                stringBuilder.append(str2);
                stringBuilder.append(zzc.zzk(zzt));
                stringBuilder.append(str2);
                return;
            case 10:
                Bundle zzs = zzbgm.zzs(parcel, i);
                Set<String> keySet = zzs.keySet();
                keySet.size();
                stringBuilder.append("{");
                Object obj = 1;
                for (String str3 : keySet) {
                    if (obj == null) {
                        stringBuilder.append(str);
                    }
                    stringBuilder.append(str2);
                    stringBuilder.append(str3);
                    stringBuilder.append(str2);
                    stringBuilder.append(":");
                    stringBuilder.append(str2);
                    stringBuilder.append(zzq.zzha(zzs.getString(str3)));
                    stringBuilder.append(str2);
                    obj = null;
                }
                stringBuilder.append("}");
                return;
            case 11:
                parcel = zzbgm.zzad(parcel, i);
                parcel.setDataPosition(0);
                zza(stringBuilder, zzbhq.zzanh(), parcel);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    private final void zza(StringBuilder stringBuilder, Map<String, zzbhq<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((zzbhq) entry.getValue()).zzgit, entry);
        }
        stringBuilder.append('{');
        int zzd = zzbgm.zzd(parcel);
        Object obj = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            Entry entry2 = (Entry) sparseArray.get(SupportMenu.USER_MASK & readInt);
            if (entry2 != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                String str = (String) entry2.getKey();
                zzbhq zzbhq = (zzbhq) entry2.getValue();
                stringBuilder.append("\"");
                stringBuilder.append(str);
                stringBuilder.append("\":");
                if (zzbhq.zzang()) {
                    int i = zzbhq.zzgiq;
                    switch (i) {
                        case 0:
                            obj = Integer.valueOf(zzbgm.zzg(parcel, readInt));
                            break;
                        case 1:
                            obj = zzbgm.zzk(parcel, readInt);
                            break;
                        case 2:
                            obj = Long.valueOf(zzbgm.zzi(parcel, readInt));
                            break;
                        case 3:
                            obj = Float.valueOf(zzbgm.zzl(parcel, readInt));
                            break;
                        case 4:
                            obj = Double.valueOf(zzbgm.zzn(parcel, readInt));
                            break;
                        case 5:
                            obj = zzbgm.zzp(parcel, readInt);
                            break;
                        case 6:
                            obj = Boolean.valueOf(zzbgm.zzc(parcel, readInt));
                            break;
                        case 7:
                            obj = zzbgm.zzq(parcel, readInt);
                            break;
                        case 8:
                        case 9:
                            obj = zzbgm.zzt(parcel, readInt);
                            break;
                        case 10:
                            obj = zzm(zzbgm.zzs(parcel, readInt));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder stringBuilder2 = new StringBuilder(36);
                            stringBuilder2.append("Unknown field out type = ");
                            stringBuilder2.append(i);
                            throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    zzb(stringBuilder, zzbhq, zzbhp.zza(zzbhq, obj));
                } else {
                    zza(stringBuilder, zzbhq, parcel, readInt);
                }
                obj = 1;
            }
        }
        if (parcel.dataPosition() == zzd) {
            stringBuilder.append('}');
            return;
        }
        StringBuilder stringBuilder3 = new StringBuilder(37);
        stringBuilder3.append("Overread allowed size end=");
        stringBuilder3.append(zzd);
        throw new zzbgn(stringBuilder3.toString(), parcel);
    }

    private Parcel zzanl() {
        int i = this.zzgjf;
        if (i == 0) {
            this.zzgjg = zzbgo.zze(this.zzgjd);
        } else if (i != 1) {
            return this.zzgjd;
        }
        zzbgo.zzai(this.zzgjd, this.zzgjg);
        this.zzgjf = 2;
        return this.zzgjd;
    }

    private final void zzb(StringBuilder stringBuilder, zzbhq<?, ?> zzbhq, Object obj) {
        if (zzbhq.zzgip) {
            ArrayList arrayList = (ArrayList) obj;
            stringBuilder.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    stringBuilder.append(",");
                }
                zza(stringBuilder, zzbhq.zzgio, arrayList.get(i));
            }
            stringBuilder.append("]");
            return;
        }
        zza(stringBuilder, zzbhq.zzgio, obj);
    }

    private static HashMap<String, String> zzm(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public String toString() {
        zzbq.checkNotNull(this.zzgiw, "Cannot convert to JSON on client side.");
        Parcel zzanl = zzanl();
        zzanl.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        zza(stringBuilder, this.zzgiw.zzgz(this.mClassName), zzanl);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        int zze = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.zzehz);
        zzbgo.zza(parcel, 2, zzanl(), false);
        int i2 = this.zzgje;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    StringBuilder stringBuilder = new StringBuilder(34);
                    stringBuilder.append("Invalid creation type: ");
                    stringBuilder.append(i2);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            parcelable = this.zzgiw;
        } else {
            parcelable = null;
        }
        zzbgo.zza(parcel, 3, parcelable, i, false);
        zzbgo.zzai(parcel, zze);
    }

    public final Map<String, zzbhq<?, ?>> zzabz() {
        zzbhv zzbhv = this.zzgiw;
        return zzbhv == null ? null : zzbhv.zzgz(this.mClassName);
    }

    public final Object zzgx(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean zzgy(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
}
