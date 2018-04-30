package org.rajawali3d.materials.textures;

import android.graphics.Bitmap;

public class OverlayTexture extends ASingleTexture {

    public OverlayTexture(OverlayTexture other)
    {
        super(other);
    }

    public OverlayTexture(String textureName)
    {
        super(TextureType.OVERLAY, textureName);
    }

    public OverlayTexture(String textureName, int resourceId)
    {
        super(TextureType.OVERLAY, textureName);
        setResourceId(resourceId);
    }

    public OverlayTexture(String textureName, Bitmap bitmap)
    {
        super(TextureType.OVERLAY, textureName, bitmap);
    }

    public OverlayTexture(String textureName, TextureAtlas atlas)
    {
        super(TextureType.OVERLAY, textureName, atlas.getTileNamed(textureName).getPage());
    }
    public OverlayTexture(String textureName, ACompressedTexture compressedTexture)
    {
        super(TextureType.OVERLAY, textureName, compressedTexture);
    }

    public OverlayTexture clone() {
        return new OverlayTexture(this);
    }

}
