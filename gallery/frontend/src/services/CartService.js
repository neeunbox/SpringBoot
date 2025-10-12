import axios from 'axios';

// 장바구니 상품 목록 조회
export const getItems = async () => {
    try {
        return await axios.get("/v1/api/cart/items");
    } catch (e) {
        return e.response;
    }
};

// 장부구니 상품 추가
export const addItem = async (itemId) => {
    try {
        return await axios.post("/v1/api/carts", {itemId});
    } catch (e) {
        return e.response;
    }
};

// 장바구니 상품 삭제
export const removeItem = async (itemId) => {
    try {
        return await axios.delete(`/v1/api/cart/items/${itemId}`);
    } catch (e) {
        return e.response;
    }
};