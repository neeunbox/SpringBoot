<script setup>
import {getItems, removeItem} from "@/services/CartService";
import {onMounted, ref} from 'vue';


// 반응형 상태
let items = ref([]); // ref 사용

// 장바구니 상품 조회
const load = async () => {
  const res = await getItems();
  if (res.status === 200) {
    items.value = res.data;
  }
};

// 컴포넌트가 마운트될 때 load 함수를 호출하도록 추가
onMounted(() => {
  load();
});

</script>

<template>
</template>

<style lang="scss" scoped>
</style>